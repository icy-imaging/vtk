// java wrapper for vtkWarpTransform object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkWarpTransform extends vtkAbstractTransform
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

  private native void Inverse_4();
  public void Inverse()
  {
    Inverse_4();
  }

  private native int GetInverseFlag_5();
  public int GetInverseFlag()
  {
    return GetInverseFlag_5();
  }

  private native void SetInverseTolerance_6(double id0);
  public void SetInverseTolerance(double id0)
  {
    SetInverseTolerance_6(id0);
  }

  private native double GetInverseTolerance_7();
  public double GetInverseTolerance()
  {
    return GetInverseTolerance_7();
  }

  private native void SetInverseIterations_8(int id0);
  public void SetInverseIterations(int id0)
  {
    SetInverseIterations_8(id0);
  }

  private native int GetInverseIterations_9();
  public int GetInverseIterations()
  {
    return GetInverseIterations_9();
  }

  private native void InternalTransformPoint_10(float id0[],float id1[]);
  public void InternalTransformPoint(float id0[],float id1[])
  {
    InternalTransformPoint_10(id0,id1);
  }

  private native void InternalTransformPoint_11(double id0[],double id1[]);
  public void InternalTransformPoint(double id0[],double id1[])
  {
    InternalTransformPoint_11(id0,id1);
  }

  private native void TemplateTransformPoint_12(float id0[],float id1[]);
  public void TemplateTransformPoint(float id0[],float id1[])
  {
    TemplateTransformPoint_12(id0,id1);
  }

  private native void TemplateTransformPoint_13(double id0[],double id1[]);
  public void TemplateTransformPoint(double id0[],double id1[])
  {
    TemplateTransformPoint_13(id0,id1);
  }

  private native void TemplateTransformInverse_14(float id0[],float id1[]);
  public void TemplateTransformInverse(float id0[],float id1[])
  {
    TemplateTransformInverse_14(id0,id1);
  }

  private native void TemplateTransformInverse_15(double id0[],double id1[]);
  public void TemplateTransformInverse(double id0[],double id1[])
  {
    TemplateTransformInverse_15(id0,id1);
  }

  public vtkWarpTransform() { super(); }

  public vtkWarpTransform(long id) { super(id); }

}
