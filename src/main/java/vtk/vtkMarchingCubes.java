// java wrapper for vtkMarchingCubes object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMarchingCubes extends vtkPolyDataAlgorithm
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

  private native void SetComputeNormals_11(int id0);
  public void SetComputeNormals(int id0)
  {
    SetComputeNormals_11(id0);
  }

  private native int GetComputeNormals_12();
  public int GetComputeNormals()
  {
    return GetComputeNormals_12();
  }

  private native void ComputeNormalsOn_13();
  public void ComputeNormalsOn()
  {
    ComputeNormalsOn_13();
  }

  private native void ComputeNormalsOff_14();
  public void ComputeNormalsOff()
  {
    ComputeNormalsOff_14();
  }

  private native void SetComputeGradients_15(int id0);
  public void SetComputeGradients(int id0)
  {
    SetComputeGradients_15(id0);
  }

  private native int GetComputeGradients_16();
  public int GetComputeGradients()
  {
    return GetComputeGradients_16();
  }

  private native void ComputeGradientsOn_17();
  public void ComputeGradientsOn()
  {
    ComputeGradientsOn_17();
  }

  private native void ComputeGradientsOff_18();
  public void ComputeGradientsOff()
  {
    ComputeGradientsOff_18();
  }

  private native void SetComputeScalars_19(int id0);
  public void SetComputeScalars(int id0)
  {
    SetComputeScalars_19(id0);
  }

  private native int GetComputeScalars_20();
  public int GetComputeScalars()
  {
    return GetComputeScalars_20();
  }

  private native void ComputeScalarsOn_21();
  public void ComputeScalarsOn()
  {
    ComputeScalarsOn_21();
  }

  private native void ComputeScalarsOff_22();
  public void ComputeScalarsOff()
  {
    ComputeScalarsOff_22();
  }

  private native void SetLocator_23(vtkIncrementalPointLocator id0);
  public void SetLocator(vtkIncrementalPointLocator id0)
  {
    SetLocator_23(id0);
  }

  private native long GetLocator_24();
  public vtkIncrementalPointLocator GetLocator()
  {
    long temp = GetLocator_24();

    if (temp == 0) return null;
    return (vtkIncrementalPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLocator_25();
  public void CreateDefaultLocator()
  {
    CreateDefaultLocator_25();
  }

  public vtkMarchingCubes() { super(); }

  public vtkMarchingCubes(long id) { super(id); }
  public native long   VTKInit();

}
