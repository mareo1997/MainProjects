export class EnergyGlobalDemandItem {
    public constructor(init: Partial<EnergyGlobalDemandItem>) {
        Object.assign(this, init);
    }

    public value: number = 0;
    public category: string = "";
    public summary: string = "";

}