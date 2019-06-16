package com.kodillapatterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigMac {

    private final String bun;
    private final String burger;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigMacBuilder {
        private String bun;
        private String burger;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();


        public BigMacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigMacBuilder burger(String burger) {
            this.burger = burger;
            return this;
        }

        public BigMacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigMac build() {
            return new BigMac(bun, burger, sauce, ingredients);
        }
    }

    private BigMac(final String bun, final String burger, final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burger = burger;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public String getBurger() {
        return burger;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", burger='" + burger + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
