// java wrapper for vtkHomogeneousTransform object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHomogeneousTransform extends vtkAbstractTransform
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

  private native void GetMatrix_5(vtkMatrix4x4 id0);
  public void GetMatrix(vtkMatrix4x4 id0)
  {
    GetMatrix_5(id0);
  }

  private native long GetMatrix_6();
  public vtkMatrix4x4 GetMatrix()
  {
    long temp = GetMatrix_6();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetHomogeneousInverse_7();
  public vtkHomogeneousTransform GetHomogeneousInverse()
  {
    long temp = GetHomogeneousInverse_7();

    if (temp == 0) return null;
    return (vtkHomogeneousTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
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

  public vtkHomogeneousTransform() { super(); }

  public vtkHomogeneousTransform(long id) { super(id); }

}
