package io.ep2p.kademlia.serialization.api;

import io.ep2p.kademlia.connection.ConnectionInfo;
import io.ep2p.kademlia.protocol.message.KademliaMessage;

import java.io.Serializable;

public interface MessageSerializer<ID extends Number, C extends ConnectionInfo> {
    <S extends Serializable> String serialize(KademliaMessage<ID, C, S> message);
    <S extends Serializable> KademliaMessage<ID, C, S> deserialize(String message);
}
