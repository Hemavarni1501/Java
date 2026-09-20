import tensorflow as tf
from tensorflow import keras
from tensorflow.keras import layers
import numpy as np

# Dataset
X = np.array([[0,0],[0,1],[1,0],[1,1]])
y = np.array([0,1,1,0])

# Model
model = keras.Sequential([
    layers.Dense(8, activation='relu', input_shape=(2,)),
    layers.Dense(8, activation='relu'),
    layers.Dense(1, activation='sigmoid')
])

# Compile
model.compile(optimizer='adam',
              loss='binary_crossentropy',
              metrics=['accuracy'])

# Train
model.fit(X, y, epochs=200, batch_size=1)

# Evaluate
loss, acc = model.evaluate(X, y)
print("Accuracy:", acc)

# Predict
print(model.predict(X))