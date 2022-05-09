#!/usr/bin/env python
# coding: utf-8

# In[2]:


import numpy as np
x=np.array([[1,2,3],[4.5,5,6]],int)
x


# In[ ]:





# In[3]:


x[0][0]


# In[4]:


x[0,2]


# In[5]:


x[0,1]=100
x


# In[7]:


x=np.array([[1,2,3,4,5],[6,7,8,9,10]],int)
x[:,2:]


# In[8]:


x[1,1:3]


# In[9]:


x[1:3] #1행 2행 전체


# In[11]:


x=np.array(range(15),int).reshape(3,-1)
x


# In[12]:


x[:,::2]


# In[13]:


x[::2,::3]


# In[15]:


np.arange(10)


# In[16]:


np.arange(-5,5)


# In[17]:


np.arange(0,5,0.5)


# In[18]:


np.ones(shape=(5,2), dtype=np.int8) #int형 5행 2열


# In[19]:


np.zeros(shape=(2,2), dtype=np.float32) #float형 2행 2열


# In[21]:


np.empty(shape=(2,4), dtype=np.float32) #float형 2행 4열


# In[22]:


x=np.arange(12).reshape(3,4)
x


# In[23]:


np.ones_like(x)


# In[24]:


np.zeros_like(x)


# In[25]:


np.identity(n=3,dtype=int)


# In[26]:


np.identity(n=4, dtype=int)


# In[28]:


np.eye(N=3, M=5)


# In[29]:


np.eye(N=3, M=5, k=2)


# In[30]:


matrix=np.arange(9).reshape(3,3)
matrix


# In[31]:


np.diag(matrix)


# In[32]:


np.diag(matrix,k=1)


# In[33]:


np.random.uniform(0,5,10)


# In[34]:


np.random.normal(0,2,10)


# In[35]:


import numpy as np
test_array=np.arange(1,11)
test_array.sum()


# In[36]:


test_array=np.arange(1,13).reshape(3,4)
test_array


# In[37]:


test_array.sum(axis=0)


# In[39]:


test_array.sum(axis=1)


# In[42]:


test_array=np.arange(1,13).reshape(3,4)
third_order_tensor=np.array([test_array, test_array, test_array])
third_order_tensor


# In[43]:


third_order_tensor.sum(axis=0) #y축


# In[45]:


third_order_tensor.sum(axis=1) #x축


# In[47]:


third_order_tensor.sum(axis=2) #z축, 면


# In[48]:


test_array=np.arange(1,13).reshape(3,4)
test_array


# In[50]:


test_array.mean(axis=1)


# In[51]:


test_array.std() #표준편차


# In[52]:


test_array.std(axis=0) #y축의 표준편차


# In[53]:


np.sqrt(test_array) #각 요소에 제곱근


# In[56]:


v1=np.array([1,2,3])
v2=np.array([4,5,6])
np.vstack((v1,v2))


# In[57]:


np.hstack((v1,v2))


# In[59]:


v1=v1.reshape(-1,1)  #벡터-> 스칼라
v2=v2.reshape(-1,1)  #랭크1->랭크0
v1


# In[60]:


v2


# In[61]:


np.hstack((v1,v2))


# In[62]:


v1=np.array([[1,2,3]])
v2=np.array([[4,5,6]])
np.concatnate((v1,v2),axis=0)


# In[ ]:




