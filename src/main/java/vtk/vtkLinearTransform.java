// java wrapper for vtkLinearTransform object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLinearTransform extends vtkHomogeneousTransform
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

  private native void TransformNormal_4(float id0[],float id1[]);
  public void TransformNormal(float id0[],float id1[])
  {
    TransformNormal_4(id0,id1);
  }

  private native void TransformNormal_5(double id0[],double id1[]);
  public void TransformNormal(double id0[],double id1[])
  {
    TransformNormal_5(id0,id1);
  }

  private native double[] TransformNormal_6(double id0,double id1,double id2);
  public double[] TransformNormal(double id0,double id1,double id2)
  {
    return TransformNormal_6(id0,id1,id2);
  }

  private native double[] TransformNormal_7(double id0[]);
  public double[] TransformNormal(double id0[])
  {
    return TransformNormal_7(id0);
  }

  private native float[] TransformFloatNormal_8(float id0,float id1,float id2);
  public float[] TransformFloatNormal(float id0,float id1,float id2)
  {
    return TransformFloatNormal_8(id0,id1,id2);
  }

  private native float[] TransformFloatNormal_9(float id0[]);
  public float[] TransformFloatNormal(float id0[])
  {
    return TransformFloatNormal_9(id0);
  }

  private native double[] TransformDoubleNormal_10(double id0,double id1,double id2);
  public double[] TransformDoubleNormal(double id0,double id1,double id2)
  {
    return TransformDoubleNormal_10(id0,id1,id2);
  }

  private native double[] TransformDoubleNormal_11(double id0[]);
  public double[] TransformDoubleNormal(double id0[])
  {
    return TransformDoubleNormal_11(id0);
  }

  private native double[] TransformVector_12(double id0,double id1,double id2);
  public double[] TransformVector(double id0,double id1,double id2)
  {
    return TransformVector_12(id0,id1,id2);
  }

  private native double[] TransformVector_13(double id0[]);
  public double[] TransformVector(double id0[])
  {
    return TransformVector_13(id0);
  }

  private native void TransformVector_14(float id0[],float id1[]);
  public void TransformVector(float id0[],float id1[])
  {
    TransformVector_14(id0,id1);
  }

  private native void TransformVector_15(double id0[],double id1[]);
  public void TransformVector(double id0[],double id1[])
  {
    TransformVector_15(id0,id1);
  }

  private native float[] TransformFloatVector_16(float id0,float id1,float id2);
  public float[] TransformFloatVector(float id0,float id1,float id2)
  {
    return TransformFloatVector_16(id0,id1,id2);
  }

  private native float[] TransformFloatVector_17(float id0[]);
  public float[] TransformFloatVector(float id0[])
  {
    return TransformFloatVector_17(id0);
  }

  private native double[] TransformDoubleVector_18(double id0,double id1,double id2);
  public double[] TransformDoubleVector(double id0,double id1,double id2)
  {
    return TransformDoubleVector_18(id0,id1,id2);
  }

  private native double[] TransformDoubleVector_19(double id0[]);
  public double[] TransformDoubleVector(double id0[])
  {
    return TransformDoubleVector_19(id0);
  }

  private native void TransformPoints_20(vtkPoints id0,vtkPoints id1);
  public void TransformPoints(vtkPoints id0,vtkPoints id1)
  {
    TransformPoints_20(id0,id1);
  }

  private native void TransformNormals_21(vtkDataArray id0,vtkDataArray id1);
  public void TransformNormals(vtkDataArray id0,vtkDataArray id1)
  {
    TransformNormals_21(id0,id1);
  }

  private native void TransformVectors_22(vtkDataArray id0,vtkDataArray id1);
  public void TransformVectors(vtkDataArray id0,vtkDataArray id1)
  {
    TransformVectors_22(id0,id1);
  }

  private native long GetLinearInverse_23();
  public vtkLinearTransform GetLinearInverse()
  {
    long temp = GetLinearInverse_23();

    if (temp == 0) return null;
    return (vtkLinearTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void InternalTransformPoint_24(float id0[],float id1[]);
  public void InternalTransformPoint(float id0[],float id1[])
  {
    InternalTransformPoint_24(id0,id1);
  }

  private native void InternalTransformPoint_25(double id0[],double id1[]);
  public void InternalTransformPoint(double id0[],double id1[])
  {
    InternalTransformPoint_25(id0,id1);
  }

  private native void InternalTransformNormal_26(float id0[],float id1[]);
  public void InternalTransformNormal(float id0[],float id1[])
  {
    InternalTransformNormal_26(id0,id1);
  }

  private native void InternalTransformNormal_27(double id0[],double id1[]);
  public void InternalTransformNormal(double id0[],double id1[])
  {
    InternalTransformNormal_27(id0,id1);
  }

  private native void InternalTransformVector_28(float id0[],float id1[]);
  public void InternalTransformVector(float id0[],float id1[])
  {
    InternalTransformVector_28(id0,id1);
  }

  private native void InternalTransformVector_29(double id0[],double id1[]);
  public void InternalTransformVector(double id0[],double id1[])
  {
    InternalTransformVector_29(id0,id1);
  }

  public vtkLinearTransform() { super(); }

  public vtkLinearTransform(long id) { super(id); }

}
