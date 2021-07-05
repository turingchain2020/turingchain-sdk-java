package one.turingchain.javasdk.model.enums;

public enum RpcMethod {

	QUERY_TRANSACTION("Turingchain.QueryTransaction"),

	BLOCKCHAIN_IS_SYNC("Turingchain.IsSync"),

	SEND_TRANSACTION("Turingchain.SendTransaction"),

	GET_TX_BY_HASHES("Turingchain.GetTxByHashes"),

	GET_HEX_TX_BY_HASH("Turingchain.GetHexTxByHash"),

	GET_BLOCKS("Turingchain.GetBlocks"),

	GET_LAST_HEADER("Turingchain.GetLastHeader"),

	GET_HEADERS("Turingchain.GetHeaders"),

	GET_BLOCK_HASH("Turingchain.GetBlockHash"),

	GET_BLOCK_DETAIL("Turingchain.GetBlockOverview"),

	GET_PEER_INFO("Turingchain.GetPeerInfo"),

	GET_WALLET_STUATUS("Turingchain.GetWalletStatus"),

	LOCK_WALLET("Turingchain.Lock"),

	UNLOCK_WALLET("Turingchain.UnLock"),

	NEW_ACCOUNT("Turingchain.NewAccount"),

	GEN_SEED("Turingchain.GenSeed"),

	SAVE_SEED("Turingchain.SaveSeed"),

	GET_SEED("Turingchain.GetSeed"),

	SET_LABEL("Turingchain.SetLabl"),

	GET_ACCOUNT_LIST("Turingchain.GetAccounts"),

	TOKEN_CREATE_PRE_CREATE_TX("token.CreateRawTokenPreCreateTx"),

	TOKEN_CREATE_FINISH_TX("token.CreateRawTokenFinishTx"),

	TOKEN_CREATE_RAW_TX("Turingchain.CreateRawTransaction"),

	SIGN_RAW_TRANSACTION("Turingchain.SignRawTx"),

	GET_TOKEN_BALANCE("token.GetTokenBalance"),

	QUERY("Turingchain.Query"),

	GET_TX_BY_ADDR("Turingchain.GetTxByAddr"),

	SEND_RAW_TRANSACTION("Turingchain.SendRawTransaction"),

	SEND_TO_ADDRESS("Turingchain.SendToAddress"),

	GET_BALANCE("Turingchain.GetBalance"),

	CREATE_TRASACTION("Turingchain.CreateTransaction"),

	DUMP_PRIVKEY("Turingchain.DumpPrivkey"),

	IMPORT_PRIVKEY("Turingchain.ImportPrivkey"),

	CREATE_NO_BALANCE_TX("Turingchain.CreateNoBalanceTransaction"),

	CONVERT_EXECER_TO_ADDRESS("Turingchain.ConvertExectoAddr"),

	DECODE_RAW_TX("Turingchain.DecodeRawTransaction"),

	TOKEN_CREATE_RAW_TOKEN_REVOKE_TX("token.CreateRawTokenRevokeTx"),

	PRE_SEND_KEY_FRAGMENT("Pre.CollectFragment"),

	PRE_RE_ENCRYPT("Pre.Reencrypt"),

	CERT_USER_REGISTER("turingchain-ca-server.RegisterUser"),

	CERT_USER_REVOKE("turingchain-ca-server.RevokeUser"),

	CERT_ENROLL("turingchain-ca-server.Enroll"),

	CERT_REENROLL("turingchain-ca-server.ReEnroll"),

	CERT_REVOKE("turingchain-ca-server.RevokeCert"),

	CERT_GET_CRL("turingchain-ca-server.GetCRL"),

	CERT_GET_USERINFO("turingchain-ca-server.GetUserInfo"),

	CERT_GET_CERTINFO("turingchain-ca-server.GetCertInfo"),

	ADD_PUSH_SUBSCRIBE("Turingchain.AddPushSubscribe"),

	LIST_PUSHES("Turingchain.ListPushes"),

	GET_PUSH_SEQ_LAST_NUM("Turingchain.GetPushSeqLastNum");

	private String method;

	private RpcMethod(String method) {
		this.method = method;
	}

	public String getMethod() {
		return method;
	}

	@Override
	public String toString() {
		return getMethod();
	}

}
