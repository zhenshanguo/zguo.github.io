Three components of Kuberneteds(K8s) cluster: 
Master Node: API Server for communication between components, Scheduler to decide which node/pod to run with how much resources, Controller manager for checking current state of pods against desired states, and etcd is for storage
Node: physical or virtual machines on cloud holding kubelet, kube proxy and container platform like docker runtime
Pods: holds one or more containers, usually one, and better to be one only