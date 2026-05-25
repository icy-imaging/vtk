// java wrapper for vtkDiscreteFlyingEdges3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDiscreteFlyingEdges3D extends vtkPolyDataAlgorithm
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

  private native long GetMTime_4();
  public long GetMTime()
  {
    return GetMTime_4();
  }

  private native void SetComputeNormals_5(int id0);
  public void SetComputeNormals(int id0)
  {
    SetComputeNormals_5(id0);
  }

  private native int GetComputeNormals_6();
  public int GetComputeNormals()
  {
    return GetComputeNormals_6();
  }

  private native void ComputeNormalsOn_7();
  public void ComputeNormalsOn()
  {
    ComputeNormalsOn_7();
  }

  private native void ComputeNormalsOff_8();
  public void ComputeNormalsOff()
  {
    ComputeNormalsOff_8();
  }

  private native void SetComputeGradients_9(int id0);
  public void SetComputeGradients(int id0)
  {
    SetComputeGradients_9(id0);
  }

  private native int GetComputeGradients_10();
  public int GetComputeGradients()
  {
    return GetComputeGradients_10();
  }

  private native void ComputeGradientsOn_11();
  public void ComputeGradientsOn()
  {
    ComputeGradientsOn_11();
  }

  private native void ComputeGradientsOff_12();
  public void ComputeGradientsOff()
  {
    ComputeGradientsOff_12();
  }

  private native void SetComputeScalars_13(int id0);
  public void SetComputeScalars(int id0)
  {
    SetComputeScalars_13(id0);
  }

  private native int GetComputeScalars_14();
  public int GetComputeScalars()
  {
    return GetComputeScalars_14();
  }

  private native void ComputeScalarsOn_15();
  public void ComputeScalarsOn()
  {
    ComputeScalarsOn_15();
  }

  private native void ComputeScalarsOff_16();
  public void ComputeScalarsOff()
  {
    ComputeScalarsOff_16();
  }

  private native void SetInterpolateAttributes_17(int id0);
  public void SetInterpolateAttributes(int id0)
  {
    SetInterpolateAttributes_17(id0);
  }

  private native int GetInterpolateAttributes_18();
  public int GetInterpolateAttributes()
  {
    return GetInterpolateAttributes_18();
  }

  private native void InterpolateAttributesOn_19();
  public void InterpolateAttributesOn()
  {
    InterpolateAttributesOn_19();
  }

  private native void InterpolateAttributesOff_20();
  public void InterpolateAttributesOff()
  {
    InterpolateAttributesOff_20();
  }

  private native void SetValue_21(int id0,double id1);
  public void SetValue(int id0,double id1)
  {
    SetValue_21(id0,id1);
  }

  private native double GetValue_22(int id0);
  public double GetValue(int id0)
  {
    return GetValue_22(id0);
  }

  private native void SetNumberOfContours_23(int id0);
  public void SetNumberOfContours(int id0)
  {
    SetNumberOfContours_23(id0);
  }

  private native long GetNumberOfContours_24();
  public long GetNumberOfContours()
  {
    return GetNumberOfContours_24();
  }

  private native void GenerateValues_25(int id0,double id1[]);
  public void GenerateValues(int id0,double id1[])
  {
    GenerateValues_25(id0,id1);
  }

  private native void GenerateValues_26(int id0,double id1,double id2);
  public void GenerateValues(int id0,double id1,double id2)
  {
    GenerateValues_26(id0,id1,id2);
  }

  private native void SetArrayComponent_27(int id0);
  public void SetArrayComponent(int id0)
  {
    SetArrayComponent_27(id0);
  }

  private native int GetArrayComponent_28();
  public int GetArrayComponent()
  {
    return GetArrayComponent_28();
  }

  public vtkDiscreteFlyingEdges3D() { super(); }

  public vtkDiscreteFlyingEdges3D(long id) { super(id); }
  public native long   VTKInit();

}
