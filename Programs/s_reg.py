import numpy as np
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense

# Step 1: Create dataset
X = np.array([1,2,3,4,5], dtype=float)
y = np.array([2,4,6,8,10], dtype=float)

# Step 2: Define the model
model = Sequential()
model.add(Dense(1, input_shape=(1,), activation='linear'))

# Step 3: Compile the model
model.compile(optimizer='adam', loss='mean_squared_error')

# Step 4: Train the model
model.fit(X, y, epochs=500, verbose=0)

# Step 5: Predict output
test_input = np.array([6])
prediction = model.predict(test_input)

print("Predicted Output:", prediction)



