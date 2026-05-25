// java wrapper for vtkContourFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkContourFilter extends vtkPolyDataAlgorithm
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

  private native int GetNumberOfContours_7();
  public int GetNumberOfContours()
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

  private native void SetUseScalarTree_23(int id0);
  public void SetUseScalarTree(int id0)
  {
    SetUseScalarTree_23(id0);
  }

  private native int GetUseScalarTree_24();
  public int GetUseScalarTree()
  {
    return GetUseScalarTree_24();
  }

  private native void UseScalarTreeOn_25();
  public void UseScalarTreeOn()
  {
    UseScalarTreeOn_25();
  }

  private native void UseScalarTreeOff_26();
  public void UseScalarTreeOff()
  {
    UseScalarTreeOff_26();
  }

  private native void SetScalarTree_27(vtkScalarTree id0);
  public void SetScalarTree(vtkScalarTree id0)
  {
    SetScalarTree_27(id0);
  }

  private native long GetScalarTree_28();
  public vtkScalarTree GetScalarTree()
  {
    long temp = GetScalarTree_28();

    if (temp == 0) return null;
    return (vtkScalarTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLocator_29(vtkIncrementalPointLocator id0);
  public void SetLocator(vtkIncrementalPointLocator id0)
  {
    SetLocator_29(id0);
  }

  private native long GetLocator_30();
  public vtkIncrementalPointLocator GetLocator()
  {
    long temp = GetLocator_30();

    if (temp == 0) return null;
    return (vtkIncrementalPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLocator_31();
  public void CreateDefaultLocator()
  {
    CreateDefaultLocator_31();
  }

  private native void SetArrayComponent_32(int id0);
  public void SetArrayComponent(int id0)
  {
    SetArrayComponent_32(id0);
  }

  private native int GetArrayComponent_33();
  public int GetArrayComponent()
  {
    return GetArrayComponent_33();
  }

  private native void SetGenerateTriangles_34(int id0);
  public void SetGenerateTriangles(int id0)
  {
    SetGenerateTriangles_34(id0);
  }

  private native int GetGenerateTriangles_35();
  public int GetGenerateTriangles()
  {
    return GetGenerateTriangles_35();
  }

  private native void GenerateTrianglesOn_36();
  public void GenerateTrianglesOn()
  {
    GenerateTrianglesOn_36();
  }

  private native void GenerateTrianglesOff_37();
  public void GenerateTrianglesOff()
  {
    GenerateTrianglesOff_37();
  }

  private native void SetOutputPointsPrecision_38(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_38(id0);
  }

  private native int GetOutputPointsPrecision_39();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_39();
  }

  private native void SetFastMode_40(boolean id0);
  public void SetFastMode(boolean id0)
  {
    SetFastMode_40(id0);
  }

  private native boolean GetFastMode_41();
  public boolean GetFastMode()
  {
    return GetFastMode_41();
  }

  private native void FastModeOn_42();
  public void FastModeOn()
  {
    FastModeOn_42();
  }

  private native void FastModeOff_43();
  public void FastModeOff()
  {
    FastModeOff_43();
  }

  private native void SetInputArray_44(byte[] id0, int len0);
  public void SetInputArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInputArray_44(bytes0, bytes0.length);
  }

  public vtkContourFilter() { super(); }

  public vtkContourFilter(long id) { super(id); }
  public native long   VTKInit();

}
