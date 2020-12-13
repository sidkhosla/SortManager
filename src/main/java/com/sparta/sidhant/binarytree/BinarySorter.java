package com.sparta.sidhant.binarytree;

import java.util.LinkedList;

public class BinarySorter implements BinaryTreeInterface {

    private final Node rootNode;

    private int numberOfElements = 0;

    public BinarySorter() {
        rootNode = null;
    }

    public BinarySorter(final int element) {
        this.rootNode = new Node(element);
        numberOfElements++;
    }

    private void addNodeToTree(Node node, int element) {

        if (element == node.getValue()) return;

        if(element < node.getValue()) {
            if(node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(element));
                numberOfElements++;
            } else {
                addNodeToTree(node.getLeftChild(),element);
            }
        }
        else if(element > node.getValue()) {
            if(node.isRightChildEmpty()) {
                node.setRightChild(new Node(element));
                numberOfElements++;
            } else {
                addNodeToTree(node.getRightChild(),element);
            }
        }
    }

    public Node findNode(int element) {
        Node node = this.rootNode;
        while(node != null ) {
            if (element == node.getValue()) {
                return node;
            }
            if (element < node.getValue()) {
                node = node.getLeftChild();
            } else {
                node = node.getRightChild();
            }
        }
        return null;
    }

    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return numberOfElements;
    }

    @Override
    public void addElements(int[] elements) {
        for(int element: elements) {
            addElement(element);
        }
    }

    public void addElement(final int element) {
        addNodeToTree(this.rootNode, element);
    }

    @Override
    public boolean findElement(int value) {
        return findNode(value) != null;
    }

    @Override
    public int getLeftChild(int element) {
        Node node = findNode(element);
        return node.getLeftChild().getValue();
    }

    @Override
    public int getRightChild(int element) {
        Node node = findNode(element);
        return node.getRightChild().getValue();
    }

    @Override
    public int[] getSortedTreeAsc() {

        int[] inOrder = new int[numberOfElements];
        int pos = 0;
        LinkedList<Node> treeQue = new LinkedList<>();
        Node current = this.rootNode;

        while(current!=null || treeQue.size()>0) {
            while(current!=null) {
                treeQue.push(current);
                current = current.getLeftChild();
            }
            current = treeQue.pop();
            inOrder[pos] = current.getValue();
            pos++;
            current = current.getRightChild();
        }
        return inOrder;
    }

    @Override
    public int[] getSortedTreeDesc() {
        int[] inOrder = new int[numberOfElements];
        int pos = 0;
        LinkedList<Node> treeQue = new LinkedList<>();
        Node current = this.rootNode;

        while(current!=null || treeQue.size()>0) {
            while(current!=null) {
                treeQue.push(current);
                current = current.getRightChild();
            }
            current = treeQue.pop();
            inOrder[pos] = current.getValue();
            pos++;
            current = current.getLeftChild();
        }
        return inOrder;
    }


    public static void main(String[] args) {
        BinarySorter test = new BinarySorter(5);
//        test.addElement(4);
        test.addElements(new int[] {3,6,10,2});

//        int[] inOrder = test.getSortedTreeAsc();
//        for(int i: inOrder) {
//            System.out.println(i);
//        }
//        System.out.println(test.rootNode.getValue());
        System.out.println(test.rootNode.getLeftChild().getLeftChild().getValue());
    }
}
