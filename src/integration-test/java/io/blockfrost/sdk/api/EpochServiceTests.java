package io.blockfrost.sdk.api;

import io.blockfrost.sdk.api.exception.APIException;
import io.blockfrost.sdk.api.model.EpochContent;
import io.blockfrost.sdk.api.util.Constants;
import io.blockfrost.sdk.impl.EpochServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class EpochServiceTests extends TestBase {

    EpochService epochService;

    @BeforeEach
    public void setup(){
        epochService = new EpochServiceImpl(Constants.BLOCKFROST_TESTNET_URL, projectId);
    }

    @Test
    public void latestEpoch_willReturn_latestEpoch() throws APIException {

        EpochContent latestEpoch = epochService.getLatestEpoch();
        assertThat(latestEpoch, is(notNullValue()));

    }

}
