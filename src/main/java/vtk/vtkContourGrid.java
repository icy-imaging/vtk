// java wrapper for vtkContourGrid object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkContourGrid extends vtkPolyDataAlgorithm
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

  private native void SetComputeScalars_15(int id0);
  public void SetComputeScalars(int id0)
  {
    SetComputeScalars_15(id0);
  }

  private native int GetComputeScalars_16();
  public int GetComputeScalars()
  {
    return GetComputeScalars_16();
  }

  private native void ComputeScalarsOn_17();
  public void ComputeScalarsOn()
  {
    ComputeScalarsOn_17();
  }

  private native void ComputeScalarsOff_18();
  public void ComputeScalarsOff()
  {
    ComputeScalarsOff_18();
  }

  private native void SetUseScalarTree_19(int id0);
  public void SetUseScalarTree(int id0)
  {
    SetUseScalarTree_19(id0);
  }

  private native int GetUseScalarTree_20();
  public int GetUseScalarTree()
  {
    return GetUseScalarTree_20();
  }

  private native void UseScalarTreeOn_21();
  public void UseScalarTreeOn()
  {
    UseScalarTreeOn_21();
  }

  private native void UseScalarTreeOff_22();
  public void UseScalarTreeOff()
  {
    UseScalarTreeOff_22();
  }

  private native void SetScalarTree_23(vtkScalarTree id0);
  public void SetScalarTree(vtkScalarTree id0)
  {
    SetScalarTree_23(id0);
  }

  private native long GetScalarTree_24();
  public vtkScalarTree GetScalarTree()
  {
    long temp = GetScalarTree_24();

    if (temp == 0) return null;
    return (vtkScalarTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLocator_25(vtkIncrementalPointLocator id0);
  public void SetLocator(vtkIncrementalPointLocator id0)
  {
    SetLocator_25(id0);
  }

  private native long GetLocator_26();
  public vtkIncrementalPointLocator GetLocator()
  {
    long temp = GetLocator_26();

    if (temp == 0) return null;
    return (vtkIncrementalPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGenerateTriangles_27(int id0);
  public void SetGenerateTriangles(int id0)
  {
    SetGenerateTriangles_27(id0);
  }

  private native int GetGenerateTriangles_28();
  public int GetGenerateTriangles()
  {
    return GetGenerateTriangles_28();
  }

  private native void GenerateTrianglesOn_29();
  public void GenerateTrianglesOn()
  {
    GenerateTrianglesOn_29();
  }

  private native void GenerateTrianglesOff_30();
  public void GenerateTrianglesOff()
  {
    GenerateTrianglesOff_30();
  }

  private native void CreateDefaultLocator_31();
  public void CreateDefaultLocator()
  {
    CreateDefaultLocator_31();
  }

  private native void SetOutputPointsPrecision_32(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_32(id0);
  }

  private native int GetOutputPointsPrecision_33();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_33();
  }

  public vtkContourGrid() { super(); }

  public vtkContourGrid(long id) { super(id); }
  public native long   VTKInit();

}
