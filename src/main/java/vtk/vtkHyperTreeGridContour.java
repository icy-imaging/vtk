// java wrapper for vtkHyperTreeGridContour object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHyperTreeGridContour extends vtkHyperTreeGridAlgorithm
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

  private native void SetLocator_4(vtkIncrementalPointLocator id0);
  public void SetLocator(vtkIncrementalPointLocator id0)
  {
    SetLocator_4(id0);
  }

  private native long GetLocator_5();
  public vtkIncrementalPointLocator GetLocator()
  {
    long temp = GetLocator_5();

    if (temp == 0) return null;
    return (vtkIncrementalPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLocator_6();
  public void CreateDefaultLocator()
  {
    CreateDefaultLocator_6();
  }

  private native long GetMTime_7();
  public long GetMTime()
  {
    return GetMTime_7();
  }

  private native void SetValue_8(int id0,double id1);
  public void SetValue(int id0,double id1)
  {
    SetValue_8(id0,id1);
  }

  private native double GetValue_9(int id0);
  public double GetValue(int id0)
  {
    return GetValue_9(id0);
  }

  private native void SetNumberOfContours_10(int id0);
  public void SetNumberOfContours(int id0)
  {
    SetNumberOfContours_10(id0);
  }

  private native long GetNumberOfContours_11();
  public long GetNumberOfContours()
  {
    return GetNumberOfContours_11();
  }

  private native void GenerateValues_12(int id0,double id1[]);
  public void GenerateValues(int id0,double id1[])
  {
    GenerateValues_12(id0,id1);
  }

  private native void GenerateValues_13(int id0,double id1,double id2);
  public void GenerateValues(int id0,double id1,double id2)
  {
    GenerateValues_13(id0,id1,id2);
  }

  private native void SetStrategy3D_14(int id0);
  public void SetStrategy3D(int id0)
  {
    SetStrategy3D_14(id0);
  }

  private native int GetStrategy3DMinValue_15();
  public int GetStrategy3DMinValue()
  {
    return GetStrategy3DMinValue_15();
  }

  private native int GetStrategy3DMaxValue_16();
  public int GetStrategy3DMaxValue()
  {
    return GetStrategy3DMaxValue_16();
  }

  private native void SetUseImplicitArrays_17(boolean id0);
  public void SetUseImplicitArrays(boolean id0)
  {
    SetUseImplicitArrays_17(id0);
  }

  private native boolean GetUseImplicitArrays_18();
  public boolean GetUseImplicitArrays()
  {
    return GetUseImplicitArrays_18();
  }

  private native void UseImplicitArraysOn_19();
  public void UseImplicitArraysOn()
  {
    UseImplicitArraysOn_19();
  }

  private native void UseImplicitArraysOff_20();
  public void UseImplicitArraysOff()
  {
    UseImplicitArraysOff_20();
  }

  public vtkHyperTreeGridContour() { super(); }

  public vtkHyperTreeGridContour(long id) { super(id); }
  public native long   VTKInit();

}
