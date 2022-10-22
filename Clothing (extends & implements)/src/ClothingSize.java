public enum ClothingSize {
    XXS(32)
            {
                @Override
                public String getDescription(ClothingSize size)
                    {
                        return "Детский размер";
                    }
        },
    XS(34),
    S(36),
    M(38),
    L(40);
    private int sizeC = 0;
    public String getDescription(ClothingSize size)
    {
        return "Взрослый размер";
    }

    ClothingSize (int sizeC)
    {
        this.sizeC = sizeC;
    }



}
