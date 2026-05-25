// java wrapper for vtkAxes object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAxes extends vtkPolyDataAlgorithm
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

  private native void SetOrigin_4(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_4(id0,id1,id2);
  }

  private native void SetOrigin_5(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_5(id0);
  }

  private native double[] GetOrigin_6();
  public double[] GetOrigin()
  {
    return GetOrigin_6();
  }

  private native void SetScaleFactor_7(double id0);
  public void SetScaleFactor(double id0)
  {
    SetScaleFactor_7(id0);
  }

  private native double GetScaleFactor_8();
  public double GetScaleFactor()
  {
    return GetScaleFactor_8();
  }

  private native void SetSymmetric_9(int id0);
  public void SetSymmetric(int id0)
  {
    SetSymmetric_9(id0);
  }

  private native int GetSymmetric_10();
  public int GetSymmetric()
  {
    return GetSymmetric_10();
  }

  private native void SymmetricOn_11();
  public void SymmetricOn()
  {
    SymmetricOn_11();
  }

  private native void SymmetricOff_12();
  public void SymmetricOff()
  {
    SymmetricOff_12();
  }

  private native void SetComputeNormals_13(int id0);
  public void SetComputeNormals(int id0)
  {
    SetComputeNormals_13(id0);
  }

  private native int GetComputeNormals_14();
  public int GetComputeNormals()
  {
    return GetComputeNormals_14();
  }

  private native void ComputeNormalsOn_15();
  public void ComputeNormalsOn()
  {
    ComputeNormalsOn_15();
  }

  private native void ComputeNormalsOff_16();
  public void ComputeNormalsOff()
  {
    ComputeNormalsOff_16();
  }

  public vtkAxes() { super(); }

  public vtkAxes(long id) { super(id); }
  public native long   VTKInit();

}
