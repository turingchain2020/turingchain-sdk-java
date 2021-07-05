package one.turingchain.javasdk.model.protobuf;

public interface TuringchainFunctional<Arg,Result> {
    Result run(Arg arg);
}
