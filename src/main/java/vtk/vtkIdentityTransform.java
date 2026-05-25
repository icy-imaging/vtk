// java wrapper for vtkIdentityTransform object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkIdentityTransform extends vtkLinearTransform
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

  private native void TransformPoints_4(vtkPoints id0,vtkPoints id1);
  public void TransformPoints(vtkPoints id0,vtkPoints id1)
  {
    TransformPoints_4(id0,id1);
  }

  private native void TransformNormals_5(vtkDataArray id0,vtkDataArray id1);
  public void TransformNormals(vtkDataArray id0,vtkDataArray id1)
  {
    TransformNormals_5(id0,id1);
  }

  private native void TransformVectors_6(vtkDataArray id0,vtkDataArray id1);
  public void TransformVectors(vtkDataArray id0,vtkDataArray id1)
  {
    TransformVectors_6(id0,id1);
  }

  private native void Inverse_7();
  public void Inverse()
  {
    Inverse_7();
  }

  private native void InternalTransformPoint_8(float id0[],float id1[]);
  public void InternalTransformPoint(float id0[],float id1[])
  {
    InternalTransformPoint_8(id0,id1);
  }

  private native void InternalTransformPoint_9(double id0[],double id1[]);
  public void InternalTransformPoint(double id0[],double id1[])
  {
    InternalTransformPoint_9(id0,id1);
  }

  private native void InternalTransformNormal_10(float id0[],float id1[]);
  public void InternalTransformNormal(float id0[],float id1[])
  {
    InternalTransformNormal_10(id0,id1);
  }

  private native void InternalTransformNormal_11(double id0[],double id1[]);
  public void InternalTransformNormal(double id0[],double id1[])
  {
    InternalTransformNormal_11(id0,id1);
  }

  private native void InternalTransformVector_12(float id0[],float id1[]);
  public void InternalTransformVector(float id0[],float id1[])
  {
    InternalTransformVector_12(id0,id1);
  }

  private native void InternalTransformVector_13(double id0[],double id1[]);
  public void InternalTransformVector(double id0[],double id1[])
  {
    InternalTransformVector_13(id0,id1);
  }

  private native long MakeTransform_14();
  public vtkAbstractTransform MakeTransform()
  {
    long temp = MakeTransform_14();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkIdentityTransform() { super(); }

  public vtkIdentityTransform(long id) { super(id); }
  public native long   VTKInit();

}
