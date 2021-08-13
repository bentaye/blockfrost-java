package io.blockfrost.sdk.impl;

import io.blockfrost.sdk.api.PoolService;
import io.blockfrost.sdk.api.exception.APIException;
import io.blockfrost.sdk.api.model.*;
import io.blockfrost.sdk.api.util.OrderEnum;
import io.blockfrost.sdk.impl.helper.ValidationHelper;
import io.blockfrost.sdk.impl.retrofit.PoolsApi;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

public class PoolServiceImpl extends BaseService implements PoolService {

    PoolsApi poolsApi;

    public PoolServiceImpl(String baseUrl, String projectId) {
        super(baseUrl, projectId);
        poolsApi = getRetrofit().create(PoolsApi.class);
    }

    private void validatePoolId(String poolId) throws APIException {
        if (poolId == null || poolId.equals("")) {
            throw new APIException("PoolId cannot be null or empty");
        }
    }

    @Override
    public List<String> getPools(int count, int page, OrderEnum order) throws APIException {

        ValidationHelper.validateCount(count);

        Call<List<String>> poolsCall = poolsApi.poolsGet(getProjectId(), count, page, order.name());

        try {
            Response<List<String>> poolsResponse = poolsCall.execute();
            return processResponse(poolsResponse);
        } catch (IOException exp) {
            throw new APIException("Exception while fetching pools ", exp);
        }
    }

    @Override
    public List<String> getPools(int count, int page) throws APIException {
        return getPools(count, page, OrderEnum.asc);
    }

    //TODO: Implement using parallel fetch
    @Override
    public List<String> getPools(OrderEnum order) throws APIException {
        return null;
    }

    @Override
    public List<String> getPools() throws APIException {
        return getPools(OrderEnum.asc);
    }

    @Override
    public List<PoolRetirementInfo> getRetiredPools(int count, int page, OrderEnum order) throws APIException {

        ValidationHelper.validateCount(count);

        Call<List<PoolRetirementInfo>> poolsCall = poolsApi.poolsRetiredGet(getProjectId(), count, page, order.name());

        try {
            Response<List<PoolRetirementInfo>> poolsResponse = poolsCall.execute();
            return processResponse(poolsResponse);
        } catch (IOException exp) {
            throw new APIException("Exception while fetching retired pools ", exp);
        }
    }

    @Override
    public List<PoolRetirementInfo> getRetiredPools(int count, int page) throws APIException {
        return getRetiredPools(count, page, OrderEnum.asc);
    }

    //TODO: Implement using parallel fetch
    @Override
    public List<PoolRetirementInfo> getRetiredPools(OrderEnum order) throws APIException {
        return null;
    }

    @Override
    public List<PoolRetirementInfo> getRetiredPools() throws APIException {
        return getRetiredPools(OrderEnum.asc);
    }

    @Override
    public List<PoolRetirementInfo> getRetiringPools(int count, int page, OrderEnum order) throws APIException {

        ValidationHelper.validateCount(count);

        Call<List<PoolRetirementInfo>> poolsCall = poolsApi.poolsRetiringGet(getProjectId(), count, page, order.name());

        try {
            Response<List<PoolRetirementInfo>> poolsResponse = poolsCall.execute();
            return processResponse(poolsResponse);
        } catch (IOException exp) {
            throw new APIException("Exception while fetching retiring pools ", exp);
        }

    }

    @Override
    public List<PoolRetirementInfo> getRetiringPools(int count, int page) throws APIException {
        return getRetiringPools(count, page, OrderEnum.asc);
    }

    //TODO: Implement using parallel fetch
    @Override
    public List<PoolRetirementInfo> getRetiringPools(OrderEnum order) throws APIException {
        return null;
    }

    @Override
    public List<PoolRetirementInfo> getRetiringPools() throws APIException {
        return getRetiringPools(OrderEnum.asc);
    }

    @Override
    public Pool getPool(String poolId) throws APIException {

        validatePoolId(poolId);

        Call<Pool> poolCall = poolsApi.poolsPoolIdGet(getProjectId(), poolId);

        try {
            Response<Pool> poolResponse = poolCall.execute();
            return processResponse(poolResponse);
        } catch (IOException exp) {
            throw new APIException("Exception while fetching pool for poolId: " + poolId, exp);
        }
    }

    @Override
    public List<PoolHistory> getPoolHistory(String poolId, int count, int page, OrderEnum order) throws APIException {

        validatePoolId(poolId);

        ValidationHelper.validateCount(count);

        Call<List<PoolHistory>> poolHistoryCall = poolsApi.poolsPoolIdHistoryGet(getProjectId(), poolId, count, page, order.name());

        try {
            Response<List<PoolHistory>> poolHistoryResponse = poolHistoryCall.execute();
            return processResponse(poolHistoryResponse);
        } catch (IOException exp) {
            throw new APIException("Exception while fetching history for poolId: " + poolId, exp);
        }
    }

    @Override
    public List<PoolHistory> getPoolHistory(String poolId, int count, int page) throws APIException {
        return getPoolHistory(poolId, count, page, OrderEnum.asc);
    }

    //TODO: Implement using parallel fetch
    @Override
    public List<PoolHistory> getPoolHistory(String poolId, OrderEnum order) throws APIException {
        return null;
    }

    @Override
    public List<PoolHistory> getPoolHistory(String poolId) throws APIException {
        return getPoolHistory(poolId, OrderEnum.asc);
    }

    @Override
    public PoolMetadata getPoolMetadata(String poolId) throws APIException {

        validatePoolId(poolId);

        Call<PoolMetadata> poolMetadataCall = poolsApi.poolsPoolIdMetadataGet(getProjectId(), poolId);

        try {
            Response<PoolMetadata> poolMetadataResponse = poolMetadataCall.execute();
            return processResponse(poolMetadataResponse);
        } catch (IOException exp) {
            throw new APIException("Exception while fetching pool metadata for poolId: " + poolId, exp);
        }
    }

    @Override
    public List<PoolRelay> getPoolRelays(String poolId) throws APIException {

        validatePoolId(poolId);

        Call<List<PoolRelay>> poolRelayCall = poolsApi.poolsPoolIdRelaysGet(getProjectId(), poolId);

        try {
            Response<List<PoolRelay>> poolRelaysResponse = poolRelayCall.execute();
            return processResponse(poolRelaysResponse);
        } catch (IOException exp) {
            throw new APIException("Exception while fetching pool relays for poolId: " + poolId, exp);
        }
    }

    @Override
    public List<PoolDelegator> getPoolDelegators(String poolId, int count, int page, OrderEnum order) throws APIException {

        validatePoolId(poolId);

        ValidationHelper.validateCount(count);

        Call<List<PoolDelegator>> poolDelegatorCall = poolsApi.poolsPoolIdDelegatorsGet(getProjectId(), poolId, count, page, order.name());

        try {
            Response<List<PoolDelegator>> poolDelegatorsResponse = poolDelegatorCall.execute();
            return processResponse(poolDelegatorsResponse);
        } catch (IOException exp) {
            throw new APIException("Exception while fetching pool delegators for poolId: " + poolId, exp);
        }
    }

    @Override
    public List<PoolDelegator> getPoolDelegators(String poolId, int count, int page) throws APIException {
        return getPoolDelegators(poolId, count, page, OrderEnum.asc);
    }

    //TODO: Implement using parallel fetch
    @Override
    public List<PoolDelegator> getPoolDelegators(String poolId, OrderEnum order) throws APIException {
        return null;
    }

    @Override
    public List<PoolDelegator> getPoolDelegators(String poolId) throws APIException {
        return getPoolDelegators(poolId, OrderEnum.asc);
    }

    @Override
    public List<String> getPoolBlocks(String poolId, int count, int page, OrderEnum order) throws APIException {

        validatePoolId(poolId);

        ValidationHelper.validateCount(count);

        Call<List<String>> poolBlockCall = poolsApi.poolsPoolIdBlocksGet(getProjectId(), poolId, count, page, order.name());

        try {
            Response<List<String>> poolBlocksResponse = poolBlockCall.execute();
            return processResponse(poolBlocksResponse);
        } catch (IOException exp) {
            throw new APIException("Exception while fetching pool blocks for poolId: " + poolId, exp);
        }
    }

    @Override
    public List<String> getPoolBlocks(String poolId, int count, int page) throws APIException {
        return getPoolBlocks(poolId, count, page, OrderEnum.asc);
    }

    //TODO: Implement using parallel fetch
    @Override
    public List<String> getPoolBlocks(String poolId, OrderEnum order) throws APIException {
        return null;
    }

    @Override
    public List<String> getPoolBlocks(String poolId) throws APIException {
        return getPoolBlocks(poolId, OrderEnum.asc);
    }

    @Override
    public List<PoolUpdate> getPoolUpdates(String poolId, int count, int page, OrderEnum order) throws APIException {
        validatePoolId(poolId);

        ValidationHelper.validateCount(count);

        Call<List<PoolUpdate>> poolUpdateCall = poolsApi.poolsPoolIdUpdatesGet(getProjectId(), poolId, count, page, order.name());

        try {
            Response<List<PoolUpdate>> poolUpdatesResponse = poolUpdateCall.execute();
            return processResponse(poolUpdatesResponse);
        } catch (IOException exp) {
            throw new APIException("Exception while fetching pool blocks for poolId: " + poolId, exp);
        }
    }

    @Override
    public List<PoolUpdate> getPoolUpdates(String poolId, int count, int page) throws APIException {
        return getPoolUpdates(poolId, count, page, OrderEnum.asc);
    }

    //TODO: Implement using parallel fetch
    @Override
    public List<PoolUpdate> getPoolUpdates(String poolId, OrderEnum order) throws APIException {
        return null;
    }

    @Override
    public List<PoolUpdate> getPoolUpdates(String poolId) throws APIException {
        return getPoolUpdates(poolId, OrderEnum.asc);
    }


}
