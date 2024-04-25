<script setup lang="ts">
import { useMessage, type FormInst } from "naive-ui";
import { ref } from "vue";

interface BookInput {
  title?: string;
  author?: string;
}

const message = useMessage();

const formRef = ref<FormInst | null>(null);
const bookInput = ref<BookInput>({});

const save = () => {
  formRef.value?.validate().then((valid) => {
    if (valid) {
      fetch("http://localhost:8080/book", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(bookInput.value),
      }).then(() => {
        message.success("Book created successfully.");
      });
    } else {
      message.error("Please fill in the form correctly.");
    }
  });
};
</script>

<template>
  <NForm ref="formRef" :model="bookInput">
    <NFormItem
      lable="Title"
      path="title"
      :rule="[{ required: true, message: 'Please enter the title.' }]"
    >
      <NInput v-model:value="bookInput.title" />
    </NFormItem>
    <NFormItem
      lable="Author"
      path="author"
      :rule="[{ required: true, message: 'Please enter the author.' }]"
    >
      <NInput v-model:value="bookInput.author" />
    </NFormItem>
    <NButton type="primary" @click="save">Save</NButton>
  </NForm>
</template>
