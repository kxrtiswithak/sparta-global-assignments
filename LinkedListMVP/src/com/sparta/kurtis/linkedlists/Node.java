package com.sparta.kurtis.linkedlists;

import com.sparta.kurtis.linkedlists.singly.SinglyNode;

public abstract class NodeAbstract {
    public String data;
    public SinglyNode next;

    public NodeAbstract(String data) {
        this.data = data;
        this.next = null;
    }
}
