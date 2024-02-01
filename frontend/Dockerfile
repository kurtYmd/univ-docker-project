FROM node:18.13-alpine

WORKDIR /app

# Copy package.json and package-lock.json
COPY package*.json ./

# Install dependencies
RUN npm install
RUN npm install -g @angular/cli

# Copy the rest of the application
COPY . .

# Expose the port
EXPOSE 4200

# Command to run the application
CMD ["ng", "serve"]
