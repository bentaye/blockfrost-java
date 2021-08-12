package io.blockfrost.sdk.api;

import io.blockfrost.sdk.api.exception.APIException;
import io.blockfrost.sdk.api.model.Address;
import io.blockfrost.sdk.api.model.AddressTotal;
import io.blockfrost.sdk.api.model.AddressUtxo;
import io.blockfrost.sdk.api.util.Constants;
import io.blockfrost.sdk.api.util.OrderEnum;
import io.blockfrost.sdk.impl.AddressServiceImpl;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AddressServiceTests extends TestBase {

    AddressService addressService;

    @BeforeEach
    public void setup(){
        addressService = new AddressServiceImpl(Constants.BLOCKFROST_TESTNET_URL, projectId);
    }

    @Test
    public void address_willReturn_addressForBechAddress() throws APIException {

        Address addressResponse = addressService.getAddress("addr_test1qqy07jaue8tru20877ak7wxpuagrqqpm2pdacfjjtv4z3elcn8dnk52656jspgq03ts2sl6jvefwakdacwfy605m9ydselehdg");
        assertThat(addressResponse.getAddress(), is("addr_test1qqy07jaue8tru20877ak7wxpuagrqqpm2pdacfjjtv4z3elcn8dnk52656jspgq03ts2sl6jvefwakdacwfy605m9ydselehdg"));

    }

    //ToDo: Is this enough or should we create a temp address and test all params
    @Test
    public void addressDetails_willReturn_addressDetailsForBechAddress() throws APIException {

        AddressTotal addressTotalResponse = addressService.getAddressDetails("addr_test1qqy07jaue8tru20877ak7wxpuagrqqpm2pdacfjjtv4z3elcn8dnk52656jspgq03ts2sl6jvefwakdacwfy605m9ydselehdg");
        assertThat(addressTotalResponse.getAddress(), is("addr_test1qqy07jaue8tru20877ak7wxpuagrqqpm2pdacfjjtv4z3elcn8dnk52656jspgq03ts2sl6jvefwakdacwfy605m9ydselehdg"));

    }

    @Nested
    @DisplayName("GetAddressUtxos Tests")
    class GetAddressUtxosTests {

        @Test
        public void addressUtxos_willReturn_addressUtxosForCountPageAndAscendingOrder() throws APIException {


            List<AddressUtxo> addressUtxoList = addressService.getAddressUtxos("addr_test1qqy07jaue8tru20877ak7wxpuagrqqpm2pdacfjjtv4z3elcn8dnk52656jspgq03ts2sl6jvefwakdacwfy605m9ydselehdg", 2, 1, OrderEnum.asc);

            assertThat(addressUtxoList, hasSize(2));
        }

        @Test
        public void addressUtxos_willReturn_addressUtxosForCountAndPage() throws APIException {


            List<AddressUtxo> addressUtxoList = addressService.getAddressUtxos("addr_test1qqy07jaue8tru20877ak7wxpuagrqqpm2pdacfjjtv4z3elcn8dnk52656jspgq03ts2sl6jvefwakdacwfy605m9ydselehdg", 2, 1);

            assertThat(addressUtxoList, hasSize(2));
        }

        @Test
        public void addressUtxos_willThrowAPIException_onNullAddress() {

            Exception exception = assertThrows(APIException.class, () -> addressService.getAddressUtxos("", 2, 1));
            assertThat(exception.getMessage(), Matchers.is("Address cannot be null or empty"));
        }

    }


}