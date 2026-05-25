// java wrapper for vtkLocator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLocator extends vtkObject
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void SetDataSet_4(vtkDataSet id0);
  public void SetDataSet(vtkDataSet id0)
  {
    SetDataSet_4(id0);
  }

  private native long GetDataSet_5();
  public vtkDataSet GetDataSet()
  {
    long temp = GetDataSet_5();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetMaxLevel_6(int id0);
  public void SetMaxLevel(int id0)
  {
    SetMaxLevel_6(id0);
  }

  private native int GetMaxLevelMinValue_7();
  public int GetMaxLevelMinValue()
  {
    return GetMaxLevelMinValue_7();
  }

  private native int GetMaxLevelMaxValue_8();
  public int GetMaxLevelMaxValue()
  {
    return GetMaxLevelMaxValue_8();
  }

  private native int GetMaxLevel_9();
  public int GetMaxLevel()
  {
    return GetMaxLevel_9();
  }

  private native int GetLevel_10();
  public int GetLevel()
  {
    return GetLevel_10();
  }

  private native void SetAutomatic_11(int id0);
  public void SetAutomatic(int id0)
  {
    SetAutomatic_11(id0);
  }

  private native int GetAutomatic_12();
  public int GetAutomatic()
  {
    return GetAutomatic_12();
  }

  private native void AutomaticOn_13();
  public void AutomaticOn()
  {
    AutomaticOn_13();
  }

  private native void AutomaticOff_14();
  public void AutomaticOff()
  {
    AutomaticOff_14();
  }

  private native void SetTolerance_15(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_15(id0);
  }

  private native double GetToleranceMinValue_16();
  public double GetToleranceMinValue()
  {
    return GetToleranceMinValue_16();
  }

  private native double GetToleranceMaxValue_17();
  public double GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_17();
  }

  private native double GetTolerance_18();
  public double GetTolerance()
  {
    return GetTolerance_18();
  }

  private native void SetUseExistingSearchStructure_19(int id0);
  public void SetUseExistingSearchStructure(int id0)
  {
    SetUseExistingSearchStructure_19(id0);
  }

  private native int GetUseExistingSearchStructure_20();
  public int GetUseExistingSearchStructure()
  {
    return GetUseExistingSearchStructure_20();
  }

  private native void UseExistingSearchStructureOn_21();
  public void UseExistingSearchStructureOn()
  {
    UseExistingSearchStructureOn_21();
  }

  private native void UseExistingSearchStructureOff_22();
  public void UseExistingSearchStructureOff()
  {
    UseExistingSearchStructureOff_22();
  }

  private native void Update_23();
  public void Update()
  {
    Update_23();
  }

  private native void Initialize_24();
  public void Initialize()
  {
    Initialize_24();
  }

  private native void BuildLocator_25();
  public void BuildLocator()
  {
    BuildLocator_25();
  }

  private native void ForceBuildLocator_26();
  public void ForceBuildLocator()
  {
    ForceBuildLocator_26();
  }

  private native void FreeSearchStructure_27();
  public void FreeSearchStructure()
  {
    FreeSearchStructure_27();
  }

  private native void GenerateRepresentation_28(int id0,vtkPolyData id1);
  public void GenerateRepresentation(int id0,vtkPolyData id1)
  {
    GenerateRepresentation_28(id0,id1);
  }

  private native long GetBuildTime_29();
  public long GetBuildTime()
  {
    return GetBuildTime_29();
  }

  private native boolean UsesGarbageCollector_30();
  public boolean UsesGarbageCollector()
  {
    return UsesGarbageCollector_30();
  }

  public vtkLocator() { super(); }

  public vtkLocator(long id) { super(id); }

}
