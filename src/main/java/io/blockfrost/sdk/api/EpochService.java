package io.blockfrost.sdk.api;

import io.blockfrost.sdk.api.exception.APIException;
import io.blockfrost.sdk.api.model.EpochContent;

public interface EpochService {

    EpochContent getLatestEpoch() throws APIException;

}
