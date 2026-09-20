import tensorflow as tf
from tensorflow import keras
import numpy as np

# Dataset
X = np.array([[0,0],
              [0,1],
              [1,0],
              [1,1]])

y = np.array([[0],[0],[0],[1]])

# Model
model = keras.Sequential([
    keras.layers.Dense(1, input_shape=(2,), activation='sigmoid')
])

# Compile
model.compile(optimizer='sgd',
              loss='binary_crossentropy',
              metrics=['accuracy'])

# Train
model.fit(X, y, epochs=100)

# Predict
predictions = model.predict(X)
print((predictions > 0.5).astype(int))