// java wrapper for vtkGenericCutter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGenericCutter extends vtkPolyDataAlgorithm
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

  private native void SetValue_4(int id0,double id1);
  public void SetValue(int id0,double id1)
  {
    SetValue_4(id0,id1);
  }

  private native double GetValue_5(int id0);
  public double GetValue(int id0)
  {
    return GetValue_5(id0);
  }

  private native void SetNumberOfContours_6(int id0);
  public void SetNumberOfContours(int id0)
  {
    SetNumberOfContours_6(id0);
  }

  private native long GetNumberOfContours_7();
  public long GetNumberOfContours()
  {
    return GetNumberOfContours_7();
  }

  private native void GenerateValues_8(int id0,double id1[]);
  public void GenerateValues(int id0,double id1[])
  {
    GenerateValues_8(id0,id1);
  }

  private native void GenerateValues_9(int id0,double id1,double id2);
  public void GenerateValues(int id0,double id1,double id2)
  {
    GenerateValues_9(id0,id1,id2);
  }

  private native long GetMTime_10();
  public long GetMTime()
  {
    return GetMTime_10();
  }

  private native void SetCutFunction_11(vtkImplicitFunction id0);
  public void SetCutFunction(vtkImplicitFunction id0)
  {
    SetCutFunction_11(id0);
  }

  private native long GetCutFunction_12();
  public vtkImplicitFunction GetCutFunction()
  {
    long temp = GetCutFunction_12();

    if (temp == 0) return null;
    return (vtkImplicitFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGenerateCutScalars_13(int id0);
  public void SetGenerateCutScalars(int id0)
  {
    SetGenerateCutScalars_13(id0);
  }

  private native int GetGenerateCutScalars_14();
  public int GetGenerateCutScalars()
  {
    return GetGenerateCutScalars_14();
  }

  private native void GenerateCutScalarsOn_15();
  public void GenerateCutScalarsOn()
  {
    GenerateCutScalarsOn_15();
  }

  private native void GenerateCutScalarsOff_16();
  public void GenerateCutScalarsOff()
  {
    GenerateCutScalarsOff_16();
  }

  private native void SetLocator_17(vtkIncrementalPointLocator id0);
  public void SetLocator(vtkIncrementalPointLocator id0)
  {
    SetLocator_17(id0);
  }

  private native long GetLocator_18();
  public vtkIncrementalPointLocator GetLocator()
  {
    long temp = GetLocator_18();

    if (temp == 0) return null;
    return (vtkIncrementalPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLocator_19();
  public void CreateDefaultLocator()
  {
    CreateDefaultLocator_19();
  }

  public vtkGenericCutter() { super(); }

  public vtkGenericCutter(long id) { super(id); }
  public native long   VTKInit();

}
