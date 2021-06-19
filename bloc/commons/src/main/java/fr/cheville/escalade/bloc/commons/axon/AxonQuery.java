package fr.cheville.escalade.bloc.commons.axon;

import org.axonframework.queryhandling.QueryExecutionException;
import org.axonframework.queryhandling.QueryGateway;
import org.axonframework.queryhandling.responsetypes.ResponseTypes;
import org.springframework.beans.factory.annotation.Autowired;

import fr.cheville.escalade.bloc.commons.axon.annotation.CommonsService;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

@CommonsService
public class AxonQuery {

    private final QueryGateway queryGateway;

    @Autowired
    public AxonQuery(QueryGateway queryGateway) {
        this.queryGateway = queryGateway;
    }

    public <R> R query(Object query, Class<R> responseType) {
        try {
            return queryGateway.query(query, responseType).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new QueryExecutionException(e.getMessage(), e);
        }
    }

    public <R> Optional<R> queryOptional(Object query, Class<R> responseType) {
        try {
            return queryGateway.query(query, AxonResponseType.optionalOf(responseType)).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new QueryExecutionException(e.getMessage(), e);
        }
    }

    public <R> List<R> queryList(Object query, Class<R> responseType) {
        try {
            return queryGateway.query(query, ResponseTypes.multipleInstancesOf(responseType)).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new QueryExecutionException(e.getMessage(), e);
        }
    }
}
