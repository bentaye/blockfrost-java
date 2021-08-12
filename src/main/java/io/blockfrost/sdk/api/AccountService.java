package io.blockfrost.sdk.api;

import io.blockfrost.sdk.api.exception.APIException;
import io.blockfrost.sdk.api.model.*;
import io.blockfrost.sdk.api.util.OrderEnum;

import java.util.List;

/**
 * Get account specific information
 */
public interface AccountService {

    /**
     * Obtain information about a specific networkStake account.
     * @param stakeAddress Bech32 networkStake address. (required)
     * @return Account
     */
    public Account getAccountByStakeAddress(String stakeAddress) throws APIException;

    /**
     * Account history
     * Obtain information about the history of a specific account.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @param count        The number of results displayed on one page.
     * @param page         The page number for listing the results.
     * @param order        The ordering of items from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.
     * @return List&lt;AccountHistory&gt;
     */
    public List<AccountHistory> getAccountHistory(String stakeAddress, int count, int page, OrderEnum order) throws APIException;

    /**
     * Account history
     * Obtain information about the history of a specific account in ascending order from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @param count        The number of results displayed on one page.
     * @param page         The page number for listing the results.
     * @return List&lt;AccountHistory&gt;
     */
    public List<AccountHistory> getAccountHistory(String stakeAddress, int count, int page) throws APIException;

    /**
     * Account history
     * Obtain information about the entire history of a specific account.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @param order        The ordering of items from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.
     * @return List&lt;AccountHistory&gt;
     */
    public List<AccountHistory> getAccountHistory(String stakeAddress, OrderEnum order) throws APIException;

    /**
     * Account history
     * Obtain information about the entire history of a specific account in ascending order from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @return List&lt;AccountHistory&gt;
     */
    public List<AccountHistory> getAccountHistory(String stakeAddress) throws APIException;

    /**
     * Account reward history
     * Obtain information about the history of a specific account.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @param count        The number of results displayed on one page. (optional, default to 100)
     * @param page         The page number for listing the results. (optional, default to 1)
     * @param order        The ordering of items from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.  (optional, default to asc)
     * @return List&lt;AccountRewardHistory&gt;
     */
    public List<AccountRewardHistory> getAccountRewardHistory(String stakeAddress, int count, int page, OrderEnum order) throws APIException;

    /**
     * Account reward history
     * Obtain information about the history of a specific account in ascending order from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @param count        The number of results displayed on one page.
     * @param page         The page number for listing the results.
     * @return List&lt;AccountRewardHistory&gt;
     */
    public List<AccountRewardHistory> getAccountRewardHistory(String stakeAddress, int count, int page) throws APIException;

    /**
     * Account reward history
     * Obtain information about the entire history of a specific account.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @param order        The ordering of items from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.
     * @return List&lt;AccountRewardHistory&gt;
     */
    public List<AccountRewardHistory> getAccountRewardHistory(String stakeAddress, OrderEnum order) throws APIException;

    /**
     * Account reward history
     * Obtain information about the entire history of a specific account in ascending order from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @return List&lt;AccountRewardHistory&gt;
     */
    public List<AccountRewardHistory> getAccountRewardHistory(String stakeAddress) throws APIException;

    /**
     * Account delegation history
     * Obtain information about the delegation of a specific account.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @param count        The number of results displayed on one page. (optional, default to 100)
     * @param page         The page number for listing the results. (optional, default to 1)
     * @param order        The ordering of items from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.  (optional, default to asc)
     * @return List&lt;AccountDelegationHistory&gt;
     */
    public List<AccountDelegationHistory> getAccountDelegationHistory(String stakeAddress, int count, int page, OrderEnum order) throws APIException;

    /**
     * Account delegation history
     * Obtain information about the delegation of a specific account in ascending order from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @param count        The number of results displayed on one page.
     * @param page         The page number for listing the results.
     * @return List&lt;AccountDelegationHistory&gt;
     */
    public List<AccountDelegationHistory> getAccountDelegationHistory(String stakeAddress, int count, int page) throws APIException;

    /**
     * Account delegation history
     * Obtain information about the delegation of a specific account.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @param order        The ordering of items from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.
     * @return List&lt;AccountDelegationHistory&gt;
     */
    public List<AccountDelegationHistory> getAccountDelegationHistory(String stakeAddress, OrderEnum order) throws APIException;

    /**
     * Account delegation history
     * Obtain information about the delegation of a specific account in ascending order from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @return List&lt;AccountDelegationHistory&gt;
     */
    public List<AccountDelegationHistory> getAccountDelegationHistory(String stakeAddress) throws APIException;

    /**
     * Account registration history
     * Obtain information about the registrations and deregistrations of a specific account.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @param count        The number of results displayed on one page. (optional, default to 100)
     * @param page         The page number for listing the results. (optional, default to 1)
     * @param order        The ordering of items from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.  (optional, default to asc)
     * @return List&lt;AccountRegistrationHistory&gt;
     */
    public List<AccountRegistrationHistory> getAccountRegistrationHistory(String stakeAddress, int count, int page, OrderEnum order) throws APIException;

    /**
     * Account registration history
     * Obtain information about the registrations and deregistrations of a specific account in ascending order from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @param count        The number of results displayed on one page.
     * @param page         The page number for listing the results.
     * @return List&lt;AccountRegistrationHistory&gt;
     */
    public List<AccountRegistrationHistory> getAccountRegistrationHistory(String stakeAddress, int count, int page) throws APIException;

    /**
     * Account registration history
     * Obtain information about all the registrations and deregistrations of a specific account.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @param order        The ordering of items from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.
     * @return List&lt;AccountRegistrationHistory&gt;
     */
    public List<AccountRegistrationHistory> getAccountRegistrationHistory(String stakeAddress, OrderEnum order) throws APIException;

    /**
     * Account registration history
     * Obtain information about all the registrations and deregistrations of a specific account in ascending order from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @return List&lt;AccountRegistrationHistory&gt;
     */
    public List<AccountRegistrationHistory> getAccountRegistrationHistory(String stakeAddress) throws APIException;

    /**
     * Account withdrawal history
     * Obtain information about the withdrawals of a specific account.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @param count        The number of results displayed on one page. (optional, default to 100)
     * @param page         The page number for listing the results. (optional, default to 1)
     * @param order        The ordering of items from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.  (optional, default to asc)
     * @return List&lt;AccountWithdrawalHistory&gt;
     */
    public List<AccountWithdrawalHistory> getAccountWithdrawalHistory(String stakeAddress, int count, int page, OrderEnum order) throws APIException;

    /**
     * Account withdrawal history
     * Obtain information about the withdrawals of a specific account in ascending order from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @param count        The number of results displayed on one page.
     * @param page         The page number for listing the results.
     * @return List&lt;AccountWithdrawalHistory&gt;
     */
    public List<AccountWithdrawalHistory> getAccountWithdrawalHistory(String stakeAddress, int count, int page) throws APIException;

    /**
     * Account withdrawal history
     * Obtain information about all the withdrawals of a specific account.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @param order        The ordering of items from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.
     * @return List&lt;AccountWithdrawalHistory&gt;
     */
    public List<AccountWithdrawalHistory> getAccountWithdrawalHistory(String stakeAddress, OrderEnum order) throws APIException;

    /**
     * Account withdrawal history
     * Obtain information about all the withdrawals of a specific account in ascending order from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @return List&lt;AccountWithdrawalHistory&gt;
     */
    public List<AccountWithdrawalHistory> getAccountWithdrawalHistory(String stakeAddress) throws APIException;

    /**
     * Account MIR history
     * Obtain information about the MIRs of a specific account.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @param count        The number of results displayed on one page. (optional, default to 100)
     * @param page         The page number for listing the results. (optional, default to 1)
     * @param order        The ordering of items from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.  (optional, default to asc)
     * @return List&lt;AccountMirHistory&gt;
     */
    public List<AccountMirHistory> getAccountMirHistory(String stakeAddress, int count, int page, OrderEnum order) throws APIException;

    /**
     * Account MIR history
     * Obtain information about the MIRs of a specific account in ascending order from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @param count        The number of results displayed on one page.
     * @param page         The page number for listing the results.
     * @return List&lt;AccountMirHistory&gt;
     */
    public List<AccountMirHistory> getAccountMirHistory(String stakeAddress, int count, int page) throws APIException;

    /**
     * Account MIR history
     * Obtain information about all the MIRs of a specific account.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @param order        The ordering of items from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.
     * @return List&lt;AccountMirHistory&gt;
     */
    public List<AccountMirHistory> getAccountMirHistory(String stakeAddress, OrderEnum order) throws APIException;

    /**
     * Account MIR history
     * Obtain information about all the MIRs of a specific account in ascending order from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @return List&lt;AccountMirHistory&gt;
     */
    public List<AccountMirHistory> getAccountMirHistory(String stakeAddress) throws APIException;

    /**
     * Account associated addresses
     * Obtain information about the addresses of a specific account.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @param count        The number of results displayed on one page. (optional, default to 100)
     * @param page         The page number for listing the results. (optional, default to 1)
     * @param order        The ordering of items from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.  (optional, default to asc)
     * @return List&lt;AccountAddress&gt;
     */
    public List<AccountAddress> getAccountAddresses(String stakeAddress, int count, int page, OrderEnum order) throws APIException;

    /**
     * Account associated addresses
     * Obtain information about the addresses of a specific account in ascending order from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @param count        The number of results displayed on one page.
     * @param page         The page number for listing the results.
     * @return List&lt;AccountAddress&gt;
     */
    public List<AccountAddress> getAccountAddresses(String stakeAddress, int count, int page) throws APIException;

    /**
     * Account associated addresses
     * Obtain information about the addresses of a specific account.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @param order        The ordering of items from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.
     * @return List&lt;AccountAddress&gt;
     */
    public List<AccountAddress> getAccountAddresses(String stakeAddress, OrderEnum order) throws APIException;

    /**
     * Account associated addresses
     * Obtain information about the addresses of a specific account in ascending order from the point of view of the blockchain, not the page listing itself. By default, we return oldest first, newest last.
     *
     * @param stakeAddress Bech32 stake address. (required)
     * @return List&lt;AccountAddress&gt;
     */
    public List<AccountAddress> getAccountAddresses(String stakeAddress) throws APIException;
}
