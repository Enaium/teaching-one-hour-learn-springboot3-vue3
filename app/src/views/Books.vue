<script setup lang="ts">
import type { DataTableColumns } from "naive-ui";
import { ref } from "vue";

interface Book {
  id: number;
  title: string;
  author: string;
  createTime: string;
}

const columns: DataTableColumns<Book> = [
  {
    title: "ID",
    key: "id",
  },
  {
    title: "Title",
    key: "title",
  },
  {
    title: "Author",
    key: "author",
  },
  {
    title: "Create Time",
    key: "createTime",
  },
];

const books = ref<Book[]>([]);

fetch("http://localhost:8080/book")
  .then((response) => response.json())
  .then((data: Book[]) => (books.value = data));
</script>

<template>
  <NDataTable :columns="columns" :data="books" />
</template>
