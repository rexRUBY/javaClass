#!/usr/bin/env python
# coding: utf-8

# In[2]:


import numpy as np
v1=np.array([[1,2,3]])
v2=np.array([[4,5,6]])
np.concatenate((v1,v2),axis=0)


# In[4]:


v1=np.array([1,2,3,4]).reshape(2,2)
v1


# In[5]:


v2=np.array([[5,6]]).T
v2


# In[9]:


np.concatenate((v1,v2),axis=1)


# In[12]:


x=np.arange(1,7).reshape(2,3)
x


# In[13]:


x+x


# In[14]:


x-x


# In[15]:


x/x


# In[16]:


x**x


# In[19]:


x_1=np.arange(1,7).reshape(2,3)
x_2=np.arange(1,7).reshape(3,2)
x_1


# In[20]:


x_2


# In[21]:


x_1.dot(x_2)


# In[22]:


x=np.arange(1,10).reshape(3,3)
x


# In[23]:


x+10 #행렬과 스칼라의 연산 ->브로드캐스팅 연산


# In[24]:


x-2


# In[25]:


x//3


# In[26]:


x**2


# In[27]:


x=np.arange(1,13).reshape(4,3)
x


# In[28]:


v=np.arange(10,40,10)
v


# In[29]:


x+v #행렬과 벡터의 연산 -> 브로드캐스팅 연산


# In[ ]:




