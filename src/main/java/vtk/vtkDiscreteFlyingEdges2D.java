// java wrapper for vtkDiscreteFlyingEdges2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDiscreteFlyingEdges2D extends vtkPolyDataAlgorithm
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

  private native void SetValue_5(int id0,double id1);
  public void SetValue(int id0,double id1)
  {
    SetValue_5(id0,id1);
  }

  private native double GetValue_6(int id0);
  public double GetValue(int id0)
  {
    return GetValue_6(id0);
  }

  private native void SetNumberOfContours_7(int id0);
  public void SetNumberOfContours(int id0)
  {
    SetNumberOfContours_7(id0);
  }

  private native long GetNumberOfContours_8();
  public long GetNumberOfContours()
  {
    return GetNumberOfContours_8();
  }

  private native void GenerateValues_9(int id0,double id1[]);
  public void GenerateValues(int id0,double id1[])
  {
    GenerateValues_9(id0,id1);
  }

  private native void GenerateValues_10(int id0,double id1,double id2);
  public void GenerateValues(int id0,double id1,double id2)
  {
    GenerateValues_10(id0,id1,id2);
  }

  private native void SetComputeScalars_11(int id0);
  public void SetComputeScalars(int id0)
  {
    SetComputeScalars_11(id0);
  }

  private native int GetComputeScalars_12();
  public int GetComputeScalars()
  {
    return GetComputeScalars_12();
  }

  private native void ComputeScalarsOn_13();
  public void ComputeScalarsOn()
  {
    ComputeScalarsOn_13();
  }

  private native void ComputeScalarsOff_14();
  public void ComputeScalarsOff()
  {
    ComputeScalarsOff_14();
  }

  private native void SetArrayComponent_15(int id0);
  public void SetArrayComponent(int id0)
  {
    SetArrayComponent_15(id0);
  }

  private native int GetArrayComponent_16();
  public int GetArrayComponent()
  {
    return GetArrayComponent_16();
  }

  public vtkDiscreteFlyingEdges2D() { super(); }

  public vtkDiscreteFlyingEdges2D(long id) { super(id); }
  public native long   VTKInit();

}
