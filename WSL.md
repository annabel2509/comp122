Steps to get check50 working on WSL

Followed this guide to install WSL and install miniconda (delete cookies if you get the paywall): https://towardsdatascience.com/data-science-on-windows-subsystem-for-linux-2-what-why-and-how-77545c9e5cdf

From a working WSL environment

sudo apt update
sudo apt install default-jre, default-jdk
cd ~
conda create -n comp122
conda activate comp122
conda install python 
pip install check50
pip install check50-java
pip install check50-junit

Run check 50 with 

check50 -l -d ... 