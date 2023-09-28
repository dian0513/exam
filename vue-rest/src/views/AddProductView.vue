<script>
import addProduct from "@/components/AddProduct.vue";
export default {
  name: "AddProductView",
  components: {
    addProduct,
  },
};
</script>

<template>
  <div class="home">
    <addProduct msg="新增商品" />
  </div>
</template>

<style scoped></style>
