package one.turingchain.javasdk.model.paraTest;

import org.junit.Test;

import com.alibaba.fastjson.JSONArray;

import one.turingchain.javasdk.client.RpcClient;
import one.turingchain.javasdk.utils.EvmUtil;
import one.turingchain.javasdk.utils.HexUtil;

/**
 * 平行链调用EVM合约
 * 适用场景：主链是联盟链（手续费功能默认是关闭），平行链用户通过自己的地址直接发起交易，不用考虑手续费的问题
 * @author fkeit
 *
 */
public class ERC721ParaTest {

	// 平行链IP
	String ip = "平行链IP";
	// 平行链服务端口
	int port = 9671;
    RpcClient client = new RpcClient(ip, port);
	    
    // 平行链名称，固定格式user.p.xxxx.  其中xxxx可替换，支持大小写英文字母
	String paraName = "user.p.evm.";
	
	// 部署合约对应的私钥
    String privateKey = "部署合约对应的私钥";
    
	 /**
     * 平行链上部署和调用ERC721合约
     * @throws InterruptedException
     */
    @Test
    public void testEvmContract() throws InterruptedException {
    	
        String code = "60806040523480156200001157600080fd5b506040518060400160405280600881526020017f47616d654974656d0000000000000000000000000000000000000000000000008152506040518060400160405280600381526020017f49544d0000000000000000000000000000000000000000000000000000000000815250620000966301ffc9a760e01b6200011860201b60201c565b8160069080519060200190620000ae92919062000221565b508060079080519060200190620000c792919062000221565b50620000e06380ac58cd60e01b6200011860201b60201c565b620000f8635b5e139f60e01b6200011860201b60201c565b6200011063780e9d6360e01b6200011860201b60201c565b5050620002d0565b63ffffffff60e01b817bffffffffffffffffffffffffffffffffffffffffffffffffffffffff19161415620001b5576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040180806020018281038252601c8152602001807f4552433136353a20696e76616c696420696e746572666163652069640000000081525060200191505060405180910390fd5b6001600080837bffffffffffffffffffffffffffffffffffffffffffffffffffffffff19167bffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916815260200190815260200160002060006101000a81548160ff02191690831515021790555050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106200026457805160ff191683800117855562000295565b8280016001018555821562000295579182015b828111156200029457825182559160200191906001019062000277565b5b509050620002a49190620002a8565b5090565b620002cd91905b80821115620002c9576000816000905550600101620002af565b5090565b90565b612c4380620002e06000396000f3fe608060405234801561001057600080fd5b50600436106101165760003560e01c80636352211e116100a2578063a22cb46511610071578063a22cb46514610629578063b88d4fde14610679578063c87b56dd1461077e578063cf37834314610825578063e985e9c51461091457610116565b80636352211e1461045d5780636c0360eb146104cb57806370a082311461054e57806395d89b41146105a657610116565b806318160ddd116100e957806318160ddd146102bf57806323b872dd146102dd5780632f745c591461034b57806342842e0e146103ad5780634f6ccce71461041b57610116565b806301ffc9a71461011b57806306fdde0314610180578063081812fc14610203578063095ea7b314610271575b600080fd5b6101666004803603602081101561013157600080fd5b8101908080357bffffffffffffffffffffffffffffffffffffffffffffffffffffffff19169060200190929190505050610990565b604051808215151515815260200191505060405180910390f35b6101886109f7565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156101c85780820151818401526020810190506101ad565b50505050905090810190601f1680156101f55780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b61022f6004803603602081101561021957600080fd5b8101908080359060200190929190505050610a99565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b6102bd6004803603604081101561028757600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff16906020019092919080359060200190929190505050610b34565b005b6102c7610c78565b6040518082815260200191505060405180910390f35b610349600480360360608110156102f357600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803573ffffffffffffffffffffffffffffffffffffffff16906020019092919080359060200190929190505050610c89565b005b6103976004803603604081101561036157600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff16906020019092919080359060200190929190505050610cff565b6040518082815260200191505060405180910390f35b610419600480360360608110156103c357600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803573ffffffffffffffffffffffffffffffffffffffff16906020019092919080359060200190929190505050610d5a565b005b6104476004803603602081101561043157600080fd5b8101908080359060200190929190505050610d7a565b6040518082815260200191505060405180910390f35b6104896004803603602081101561047357600080fd5b8101908080359060200190929190505050610d9d565b604051808273ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200191505060405180910390f35b6104d3610dd4565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156105135780820151818401526020810190506104f8565b50505050905090810190601f1680156105405780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6105906004803603602081101561056457600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190505050610e76565b6040518082815260200191505060405180910390f35b6105ae610f4b565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156105ee5780820151818401526020810190506105d3565b50505050905090810190601f16801561061b5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6106776004803603604081101561063f57600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803515159060200190929190505050610fed565b005b61077c6004803603608081101561068f57600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803573ffffffffffffffffffffffffffffffffffffffff16906020019092919080359060200190929190803590602001906401000000008111156106f657600080fd5b82018360208201111561070857600080fd5b8035906020019184600183028401116401000000008311171561072a57600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f8201169050808301925050505050505091929192905050506111a5565b005b6107aa6004803603602081101561079457600080fd5b810190808035906020019092919050505061121d565b6040518080602001828103825283818151815260200191508051906020019080838360005b838110156107ea5780820151818401526020810190506107cf565b50505050905090810190601f1680156108175780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6108fe6004803603604081101561083b57600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff1690602001909291908035906020019064010000000081111561087857600080fd5b82018360208201111561088a57600080fd5b803590602001918460018302840111640100000000831117156108ac57600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600081840152601f19601f820116905080830192505050505050509192919290505050611506565b6040518082815260200191505060405180910390f35b6109766004803603604081101561092a57600080fd5b81019080803573ffffffffffffffffffffffffffffffffffffffff169060200190929190803573ffffffffffffffffffffffffffffffffffffffff16906020019092919050505061153e565b604051808215151515815260200191505060405180910390f35b6000806000837bffffffffffffffffffffffffffffffffffffffffffffffffffffffff19167bffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916815260200190815260200160002060009054906101000a900460ff169050919050565b606060068054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610a8f5780601f10610a6457610100808354040283529160200191610a8f565b820191906000526020600020905b815481529060010190602001808311610a7257829003601f168201915b5050505050905090565b6000610aa4826115d2565b610af9576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040180806020018281038252602c815260200180612b0c602c913960400191505060405180910390fd5b6004600083815260200190815260200160002060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff169050919050565b6000610b3f82610d9d565b90508073ffffffffffffffffffffffffffffffffffffffff168373ffffffffffffffffffffffffffffffffffffffff161415610bc6576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401808060200182810382526021815260200180612bbc6021913960400191505060405180910390fd5b8073ffffffffffffffffffffffffffffffffffffffff16610be56115ef565b73ffffffffffffffffffffffffffffffffffffffff161480610c145750610c1381610c0e6115ef565b61153e565b5b610c69576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401808060200182810382526038815260200180612a5f6038913960400191505060405180910390fd5b610c7383836115f7565b505050565b6000610c8460026116b0565b905090565b610c9a610c946115ef565b826116c5565b610cef576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401808060200182810382526031815260200180612bdd6031913960400191505060405180910390fd5b610cfa8383836117b9565b505050565b6000610d5282600160008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020019081526020016000206119fc90919063ffffffff16565b905092915050565b610d75838383604051806020016040528060008152506111a5565b505050565b600080610d91836002611a1690919063ffffffff16565b50905080915050919050565b6000610dcd82604051806060016040528060298152602001612ac1602991396002611a459092919063ffffffff16565b9050919050565b606060098054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610e6c5780601f10610e4157610100808354040283529160200191610e6c565b820191906000526020600020905b815481529060010190602001808311610e4f57829003601f168201915b5050505050905090565b60008073ffffffffffffffffffffffffffffffffffffffff168273ffffffffffffffffffffffffffffffffffffffff161415610efd576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040180806020018281038252602a815260200180612a97602a913960400191505060405180910390fd5b610f44600160008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020611a64565b9050919050565b606060078054600181600116156101000203166002900480601f016020809104026020016040519081016040528092919081815260200182805460018160011615610100020316600290048015610fe35780601f10610fb857610100808354040283529160200191610fe3565b820191906000526020600020905b815481529060010190602001808311610fc657829003601f168201915b5050505050905090565b610ff56115ef565b73ffffffffffffffffffffffffffffffffffffffff168273ffffffffffffffffffffffffffffffffffffffff161415611096576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260198152602001807f4552433732313a20617070726f766520746f2063616c6c65720000000000000081525060200191505060405180910390fd5b80600560006110a36115ef565b73ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060006101000a81548160ff0219169083151502179055508173ffffffffffffffffffffffffffffffffffffffff166111506115ef565b73ffffffffffffffffffffffffffffffffffffffff167f17307eab39ab6107e8899845ad3d59bd9653f200f220920489ca2b5937696c3183604051808215151515815260200191505060405180910390a35050565b6111b66111b06115ef565b836116c5565b61120b576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401808060200182810382526031815260200180612bdd6031913960400191505060405180910390fd5b61121784848484611a79565b50505050565b6060611228826115d2565b61127d576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040180806020018281038252602f815260200180612b8d602f913960400191505060405180910390fd5b6060600860008481526020019081526020016000208054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156113265780601f106112fb57610100808354040283529160200191611326565b820191906000526020600020905b81548152906001019060200180831161130957829003601f168201915b505050505090506000600980546001816001161561010002031660029004905014156113555780915050611501565b60008151111561142e5760098160405160200180838054600181600116156101000203166002900480156113c05780601f1061139e5761010080835404028352918201916113c0565b820191906000526020600020905b8154815290600101906020018083116113ac575b505082805190602001908083835b602083106113f157805182526020820191506020810190506020830392506113ce565b6001836020036101000a03801982511681845116808217855250505050505090500192505050604051602081830303815290604052915050611501565b600961143984611aeb565b60405160200180838054600181600116156101000203166002900480156114975780601f10611475576101008083540402835291820191611497565b820191906000526020600020905b815481529060010190602001808311611483575b505082805190602001908083835b602083106114c857805182526020820191506020810190506020830392506114a5565b6001836020036101000a038019825116818451168082178552505050505050905001925050506040516020818303038152906040529150505b919050565b6000611512600a611c32565b600061151e600a611c48565b905061152a8482611c56565b6115348184611e4a565b8091505092915050565b6000600560008473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff16905092915050565b60006115e8826002611ed490919063ffffffff16565b9050919050565b600033905090565b816004600083815260200190815260200160002060006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550808273ffffffffffffffffffffffffffffffffffffffff1661166a83610d9d565b73ffffffffffffffffffffffffffffffffffffffff167f8c5be1e5ebec7d5bd14f71427d1e84f3dd0314c0f7b2291e5b200ac8c7c3b92560405160405180910390a45050565b60006116be82600001611eee565b9050919050565b60006116d0826115d2565b611725576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040180806020018281038252602c815260200180612a33602c913960400191505060405180910390fd5b600061173083610d9d565b90508073ffffffffffffffffffffffffffffffffffffffff168473ffffffffffffffffffffffffffffffffffffffff16148061179f57508373ffffffffffffffffffffffffffffffffffffffff1661178784610a99565b73ffffffffffffffffffffffffffffffffffffffff16145b806117b057506117af818561153e565b5b91505092915050565b8273ffffffffffffffffffffffffffffffffffffffff166117d982610d9d565b73ffffffffffffffffffffffffffffffffffffffff1614611845576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401808060200182810382526029815260200180612b646029913960400191505060405180910390fd5b600073ffffffffffffffffffffffffffffffffffffffff168273ffffffffffffffffffffffffffffffffffffffff1614156118cb576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260248152602001806129e96024913960400191505060405180910390fd5b6118d6838383611eff565b6118e16000826115f7565b61193281600160008673ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020611f0490919063ffffffff16565b5061198481600160008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020611f1e90919063ffffffff16565b5061199b81836002611f389092919063ffffffff16565b50808273ffffffffffffffffffffffffffffffffffffffff168473ffffffffffffffffffffffffffffffffffffffff167fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef60405160405180910390a4505050565b6000611a0b8360000183611f6d565b60001c905092915050565b600080600080611a298660000186611ff0565b915091508160001c8160001c8090509350935050509250929050565b6000611a58846000018460001b84612089565b60001c90509392505050565b6000611a728260000161217f565b9050919050565b611a848484846117b9565b611a9084848484612190565b611ae5576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260328152602001806129b76032913960400191505060405180910390fd5b50505050565b60606000821415611b33576040518060400160405280600181526020017f30000000000000000000000000000000000000000000000000000000000000008152509050611c2d565b600082905060005b60008214611b5d578080600101915050600a8281611b5557fe5b049150611b3b565b60608167ffffffffffffffff81118015611b7657600080fd5b506040519080825280601f01601f191660200182016040528015611ba95781602001600182028036833780820191505090505b50905060006001830390508593505b60008414611c2557600a8481611bca57fe5b0660300160f81b82828060019003935081518110611be457fe5b60200101907effffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916908160001a905350600a8481611c1d57fe5b049350611bb8565b819450505050505b919050565b6001816000016000828254019250508190555050565b600081600001549050919050565b600073ffffffffffffffffffffffffffffffffffffffff168273ffffffffffffffffffffffffffffffffffffffff161415611cf9576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260208152602001807f4552433732313a206d696e7420746f20746865207a65726f206164647265737381525060200191505060405180910390fd5b611d02816115d2565b15611d75576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040180806020018281038252601c8152602001807f4552433732313a20746f6b656e20616c7265616479206d696e7465640000000081525060200191505060405180910390fd5b611d8160008383611eff565b611dd281600160008573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff168152602001908152602001600020611f1e90919063ffffffff16565b50611de981836002611f389092919063ffffffff16565b50808273ffffffffffffffffffffffffffffffffffffffff16600073ffffffffffffffffffffffffffffffffffffffff167fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef60405160405180910390a45050565b611e53826115d2565b611ea8576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040180806020018281038252602c815260200180612b38602c913960400191505060405180910390fd5b80600860008481526020019081526020016000209080519060200190611ecf9291906128ef565b505050565b6000611ee6836000018360001b6123d5565b905092915050565b600081600001805490509050919050565b505050565b6000611f16836000018360001b6123f8565b905092915050565b6000611f30836000018360001b6124e0565b905092915050565b6000611f64846000018460001b8473ffffffffffffffffffffffffffffffffffffffff1660001b612550565b90509392505050565b600081836000018054905011611fce576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825260228152602001806129956022913960400191505060405180910390fd5b826000018281548110611fdd57fe5b9060005260206000200154905092915050565b60008082846000018054905011612052576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401808060200182810382526022815260200180612aea6022913960400191505060405180910390fd5b600084600001848154811061206357fe5b906000526020600020906002020190508060000154816001015492509250509250929050565b60008084600101600085815260200190815260200160002054905060008114158390612150576040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825283818151815260200191508051906020019080838360005b838110156121155780820151818401526020810190506120fa565b50505050905090810190601f1680156121425780820380516001836020036101000a031916815260200191505b509250505060405180910390fd5b5084600001600182038154811061216357fe5b9060005260206000209060020201600101549150509392505050565b600081600001805490509050919050565b60006121b18473ffffffffffffffffffffffffffffffffffffffff1661262c565b6121be57600190506123cd565b606061235463150b7a0260e01b6121d36115ef565b888787604051602401808573ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1681526020018473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200183815260200180602001828103825283818151815260200191508051906020019080838360005b83811015612283578082015181840152602081019050612268565b50505050905090810190601f1680156122b05780820380516001836020036101000a031916815260200191505b5095505050505050604051602081830303815290604052907bffffffffffffffffffffffffffffffffffffffffffffffffffffffff19166020820180517bffffffffffffffffffffffffffffffffffffffffffffffffffffffff83818316178352505050506040518060600160405280603281526020016129b7603291398773ffffffffffffffffffffffffffffffffffffffff1661263f9092919063ffffffff16565b9050600081806020019051602081101561236d57600080fd5b8101908080519060200190929190505050905063150b7a0260e01b7bffffffffffffffffffffffffffffffffffffffffffffffffffffffff1916817bffffffffffffffffffffffffffffffffffffffffffffffffffffffff191614925050505b949350505050565b600080836001016000848152602001908152602001600020541415905092915050565b600080836001016000848152602001908152602001600020549050600081146124d4576000600182039050600060018660000180549050039050600086600001828154811061244357fe5b906000526020600020015490508087600001848154811061246057fe5b906000526020600020018190555060018301876001016000838152602001908152602001600020819055508660000180548061249857fe5b600190038181906000526020600020016000905590558660010160008781526020019081526020016000206000905560019450505050506124da565b60009150505b92915050565b60006124ec8383612657565b61254557826000018290806001815401808255809150506001900390600052602060002001600090919091909150558260000180549050836001016000848152602001908152602001600020819055506001905061254a565b600090505b92915050565b60008084600101600085815260200190815260200160002054905060008114156125f757846000016040518060400160405280868152602001858152509080600181540180825580915050600190039060005260206000209060020201600090919091909150600082015181600001556020820151816001015550508460000180549050856001016000868152602001908152602001600020819055506001915050612625565b8285600001600183038154811061260a57fe5b90600052602060002090600202016001018190555060009150505b9392505050565b600080823b905060008111915050919050565b606061264e848460008561267a565b90509392505050565b600080836001016000848152602001908152602001600020541415905092915050565b6060824710156126d5576040517f08c379a0000000000000000000000000000000000000000000000000000000008152600401808060200182810382526026815260200180612a0d6026913960400191505060405180910390fd5b6126de8561262c565b612750576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040180806020018281038252601d8152602001807f416464726573733a2063616c6c20746f206e6f6e2d636f6e747261637400000081525060200191505060405180910390fd5b600060608673ffffffffffffffffffffffffffffffffffffffff1685876040518082805190602001908083835b602083106127a0578051825260208201915060208101905060208303925061277d565b6001836020036101000a03801982511681845116808217855250505050505090500191505060006040518083038185875af1925050503d8060008114612802576040519150601f19603f3d011682016040523d82523d6000602084013e612807565b606091505b5091509150612817828286612823565b92505050949350505050565b60608315612833578290506128e8565b6000835111156128465782518084602001fd5b816040517f08c379a00000000000000000000000000000000000000000000000000000000081526004018080602001828103825283818151815260200191508051906020019080838360005b838110156128ad578082015181840152602081019050612892565b50505050905090810190601f1680156128da5780820380516001836020036101000a031916815260200191505b509250505060405180910390fd5b9392505050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061293057805160ff191683800117855561295e565b8280016001018555821561295e579182015b8281111561295d578251825591602001919060010190612942565b5b50905061296b919061296f565b5090565b61299191905b8082111561298d576000816000905550600101612975565b5090565b9056fe456e756d657261626c655365743a20696e646578206f7574206f6620626f756e64734552433732313a207472616e7366657220746f206e6f6e20455243373231526563656976657220696d706c656d656e7465724552433732313a207472616e7366657220746f20746865207a65726f2061646472657373416464726573733a20696e73756666696369656e742062616c616e636520666f722063616c6c4552433732313a206f70657261746f7220717565727920666f72206e6f6e6578697374656e7420746f6b656e4552433732313a20617070726f76652063616c6c6572206973206e6f74206f776e6572206e6f7220617070726f76656420666f7220616c6c4552433732313a2062616c616e636520717565727920666f7220746865207a65726f20616464726573734552433732313a206f776e657220717565727920666f72206e6f6e6578697374656e7420746f6b656e456e756d657261626c654d61703a20696e646578206f7574206f6620626f756e64734552433732313a20617070726f76656420717565727920666f72206e6f6e6578697374656e7420746f6b656e4552433732314d657461646174613a2055524920736574206f66206e6f6e6578697374656e7420746f6b656e4552433732313a207472616e73666572206f6620746f6b656e2074686174206973206e6f74206f776e4552433732314d657461646174613a2055524920717565727920666f72206e6f6e6578697374656e7420746f6b656e4552433732313a20617070726f76616c20746f2063757272656e74206f776e65724552433732313a207472616e736665722063616c6c6572206973206e6f74206f776e6572206e6f7220617070726f766564a26469706673582212206ada504e4537316d961b53c1263cff2f95e637347d01f81fa85879e2106963b264736f6c63430006050033";
        String abi = "[{\"inputs\":[],\"stateMutability\":\"nonpayable\",\"type\":\"constructor\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":true,\"internalType\":\"address\",\"name\":\"owner\",\"type\":\"address\"},{\"indexed\":true,\"internalType\":\"address\",\"name\":\"approved\",\"type\":\"address\"},{\"indexed\":true,\"internalType\":\"uint256\",\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"Approval\",\"type\":\"event\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":true,\"internalType\":\"address\",\"name\":\"owner\",\"type\":\"address\"},{\"indexed\":true,\"internalType\":\"address\",\"name\":\"operator\",\"type\":\"address\"},{\"indexed\":false,\"internalType\":\"bool\",\"name\":\"approved\",\"type\":\"bool\"}],\"name\":\"ApprovalForAll\",\"type\":\"event\"},{\"anonymous\":false,\"inputs\":[{\"indexed\":true,\"internalType\":\"address\",\"name\":\"from\",\"type\":\"address\"},{\"indexed\":true,\"internalType\":\"address\",\"name\":\"to\",\"type\":\"address\"},{\"indexed\":true,\"internalType\":\"uint256\",\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"Transfer\",\"type\":\"event\"},{\"inputs\":[{\"internalType\":\"address\",\"name\":\"to\",\"type\":\"address\"},{\"internalType\":\"uint256\",\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"approve\",\"outputs\":[],\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"inputs\":[{\"internalType\":\"address\",\"name\":\"player\",\"type\":\"address\"},{\"internalType\":\"string\",\"name\":\"tokenURI\",\"type\":\"string\"}],\"name\":\"awardItem\",\"outputs\":[{\"internalType\":\"uint256\",\"name\":\"\",\"type\":\"uint256\"}],\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"inputs\":[{\"internalType\":\"address\",\"name\":\"owner\",\"type\":\"address\"}],\"name\":\"balanceOf\",\"outputs\":[{\"internalType\":\"uint256\",\"name\":\"\",\"type\":\"uint256\"}],\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[],\"name\":\"baseURI\",\"outputs\":[{\"internalType\":\"string\",\"name\":\"\",\"type\":\"string\"}],\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[{\"internalType\":\"uint256\",\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"getApproved\",\"outputs\":[{\"internalType\":\"address\",\"name\":\"\",\"type\":\"address\"}],\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[{\"internalType\":\"address\",\"name\":\"owner\",\"type\":\"address\"},{\"internalType\":\"address\",\"name\":\"operator\",\"type\":\"address\"}],\"name\":\"isApprovedForAll\",\"outputs\":[{\"internalType\":\"bool\",\"name\":\"\",\"type\":\"bool\"}],\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[],\"name\":\"name\",\"outputs\":[{\"internalType\":\"string\",\"name\":\"\",\"type\":\"string\"}],\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[{\"internalType\":\"uint256\",\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"ownerOf\",\"outputs\":[{\"internalType\":\"address\",\"name\":\"\",\"type\":\"address\"}],\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[{\"internalType\":\"address\",\"name\":\"from\",\"type\":\"address\"},{\"internalType\":\"address\",\"name\":\"to\",\"type\":\"address\"},{\"internalType\":\"uint256\",\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"safeTransferFrom\",\"outputs\":[],\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"inputs\":[{\"internalType\":\"address\",\"name\":\"from\",\"type\":\"address\"},{\"internalType\":\"address\",\"name\":\"to\",\"type\":\"address\"},{\"internalType\":\"uint256\",\"name\":\"tokenId\",\"type\":\"uint256\"},{\"internalType\":\"bytes\",\"name\":\"_data\",\"type\":\"bytes\"}],\"name\":\"safeTransferFrom\",\"outputs\":[],\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"inputs\":[{\"internalType\":\"address\",\"name\":\"operator\",\"type\":\"address\"},{\"internalType\":\"bool\",\"name\":\"approved\",\"type\":\"bool\"}],\"name\":\"setApprovalForAll\",\"outputs\":[],\"stateMutability\":\"nonpayable\",\"type\":\"function\"},{\"inputs\":[{\"internalType\":\"bytes4\",\"name\":\"interfaceId\",\"type\":\"bytes4\"}],\"name\":\"supportsInterface\",\"outputs\":[{\"internalType\":\"bool\",\"name\":\"\",\"type\":\"bool\"}],\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[],\"name\":\"symbol\",\"outputs\":[{\"internalType\":\"string\",\"name\":\"\",\"type\":\"string\"}],\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[{\"internalType\":\"uint256\",\"name\":\"index\",\"type\":\"uint256\"}],\"name\":\"tokenByIndex\",\"outputs\":[{\"internalType\":\"uint256\",\"name\":\"\",\"type\":\"uint256\"}],\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[{\"internalType\":\"address\",\"name\":\"owner\",\"type\":\"address\"},{\"internalType\":\"uint256\",\"name\":\"index\",\"type\":\"uint256\"}],\"name\":\"tokenOfOwnerByIndex\",\"outputs\":[{\"internalType\":\"uint256\",\"name\":\"\",\"type\":\"uint256\"}],\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[{\"internalType\":\"uint256\",\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"tokenURI\",\"outputs\":[{\"internalType\":\"string\",\"name\":\"\",\"type\":\"string\"}],\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[],\"name\":\"totalSupply\",\"outputs\":[{\"internalType\":\"uint256\",\"name\":\"\",\"type\":\"uint256\"}],\"stateMutability\":\"view\",\"type\":\"function\"},{\"inputs\":[{\"internalType\":\"address\",\"name\":\"from\",\"type\":\"address\"},{\"internalType\":\"address\",\"name\":\"to\",\"type\":\"address\"},{\"internalType\":\"uint256\",\"name\":\"tokenId\",\"type\":\"uint256\"}],\"name\":\"transferFrom\",\"outputs\":[],\"stateMutability\":\"nonpayable\",\"type\":\"function\"}]";

        String txEncode = null;
        String submitTransaction = null;
        
        // GAS费预估算
//      String feelog = client.queryEVMGas(paraName + "evm", code, abi, "");
        
        // 部署合约
        txEncode = EvmUtil.createEvmContract(HexUtil.fromHexString(code), "", "evm-erc721", abi, privateKey, paraName);
        submitTransaction = client.submitTransaction(txEncode);
        String contractName = submitTransaction;
        System.out.println(submitTransaction);
        Thread.sleep(10000);
        
        
        // 合约名称
        String paraExecName = paraName + "user.evm." + contractName;
        // 合约地址的计算
        String paraExecAddress = client.convertExectoAddr(paraExecName);
        
        // 查看合约 的ABI信息
        JSONArray abiInfo = client.queryEVMABIInfo(paraExecAddress, paraExecName);
        System.out.println("合约绑定的ABI信息：　" + abiInfo);

        // 调用合约
        txEncode = EvmUtil.callEvmContract("".getBytes(),"", 0, "awardItem(\"14KEKbYtKKQm4wMthSK9J4La4nAiidGozt\",\"{\"ITEM\":\"picture1\",\"price\":\"10000\",\"author\",\"Andy\"}\")", contractName, privateKey, paraName);
        submitTransaction = client.submitTransaction(txEncode);
        System.out.println(submitTransaction);
        Thread.sleep(10000);
        
        // 查询
        JSONArray abiResult = client.queryEVMABIResult(paraExecAddress, paraExecName, "symbol()");
        System.out.println("symbol信息：　" + abiResult);
        
        // 查询token对应的owner
        JSONArray ownerResult = client.queryEVMABIResult(paraExecAddress, paraExecName, "ownerOf(1)");
        System.out.println("owner信息：　" + ownerResult);
        
        // 查询token URI
        JSONArray uriResult = client.queryEVMABIResult(paraExecAddress, paraExecName, "tokenURI(1)");
        System.out.println("tokenURI信息：" + uriResult);
        
        // 查询token 余额
        JSONArray balanceResult = client.queryEVMABIResult(paraExecAddress, paraExecName, "balanceOf(14KEKbYtKKQm4wMthSK9J4La4nAiidGozt)");
        System.out.println("14KEKbYtKKQm4wMthSK9J4La4nAiidGozt 地址余额信息：" + balanceResult);
        
        // 安全转账
        txEncode = EvmUtil.callEvmContract("".getBytes(),"", 0, "safeTransferFrom(\"14KEKbYtKKQm4wMthSK9J4La4nAiidGozt\",\"1CbEVT9RnM5oZhWMj4fxUrJX94VtRotzvs\", 1)", contractName, "CC38546E9E659D15E6B4893F0AB32A06D103931A8230B0BDE71459D2B27D6944", paraName);
        submitTransaction = client.submitTransaction(txEncode);
        System.out.println(submitTransaction);
        Thread.sleep(10000);
        
        // 查询from 地址下的token 余额
        balanceResult = client.queryEVMABIResult(paraExecAddress, paraExecName, "balanceOf(14KEKbYtKKQm4wMthSK9J4La4nAiidGozt)");
        System.out.println("14KEKbYtKKQm4wMthSK9J4La4nAiidGozt 地址余额信息：" + balanceResult);
        
        // 查询to 地址下的token 余额
        balanceResult = client.queryEVMABIResult(paraExecAddress, paraExecName, "balanceOf(1CbEVT9RnM5oZhWMj4fxUrJX94VtRotzvs)");
        System.out.println("1CbEVT9RnM5oZhWMj4fxUrJX94VtRotzvs 地址余额信息：" + balanceResult);
        
    }
}