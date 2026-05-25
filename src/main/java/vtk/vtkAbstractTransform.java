// java wrapper for vtkAbstractTransform object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAbstractTransform extends vtkObject
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

  private native void TransformPoint_4(float id0[],float id1[]);
  public void TransformPoint(float id0[],float id1[])
  {
    TransformPoint_4(id0,id1);
  }

  private native void TransformPoint_5(double id0[],double id1[]);
  public void TransformPoint(double id0[],double id1[])
  {
    TransformPoint_5(id0,id1);
  }

  private native double[] TransformPoint_6(double id0,double id1,double id2);
  public double[] TransformPoint(double id0,double id1,double id2)
  {
    return TransformPoint_6(id0,id1,id2);
  }

  private native double[] TransformPoint_7(double id0[]);
  public double[] TransformPoint(double id0[])
  {
    return TransformPoint_7(id0);
  }

  private native float[] TransformFloatPoint_8(float id0,float id1,float id2);
  public float[] TransformFloatPoint(float id0,float id1,float id2)
  {
    return TransformFloatPoint_8(id0,id1,id2);
  }

  private native float[] TransformFloatPoint_9(float id0[]);
  public float[] TransformFloatPoint(float id0[])
  {
    return TransformFloatPoint_9(id0);
  }

  private native double[] TransformDoublePoint_10(double id0,double id1,double id2);
  public double[] TransformDoublePoint(double id0,double id1,double id2)
  {
    return TransformDoublePoint_10(id0,id1,id2);
  }

  private native double[] TransformDoublePoint_11(double id0[]);
  public double[] TransformDoublePoint(double id0[])
  {
    return TransformDoublePoint_11(id0);
  }

  private native void TransformNormalAtPoint_12(float id0[],float id1[],float id2[]);
  public void TransformNormalAtPoint(float id0[],float id1[],float id2[])
  {
    TransformNormalAtPoint_12(id0,id1,id2);
  }

  private native void TransformNormalAtPoint_13(double id0[],double id1[],double id2[]);
  public void TransformNormalAtPoint(double id0[],double id1[],double id2[])
  {
    TransformNormalAtPoint_13(id0,id1,id2);
  }

  private native double[] TransformNormalAtPoint_14(double id0[],double id1[]);
  public double[] TransformNormalAtPoint(double id0[],double id1[])
  {
    return TransformNormalAtPoint_14(id0,id1);
  }

  private native double[] TransformDoubleNormalAtPoint_15(double id0[],double id1[]);
  public double[] TransformDoubleNormalAtPoint(double id0[],double id1[])
  {
    return TransformDoubleNormalAtPoint_15(id0,id1);
  }

  private native float[] TransformFloatNormalAtPoint_16(float id0[],float id1[]);
  public float[] TransformFloatNormalAtPoint(float id0[],float id1[])
  {
    return TransformFloatNormalAtPoint_16(id0,id1);
  }

  private native void TransformVectorAtPoint_17(float id0[],float id1[],float id2[]);
  public void TransformVectorAtPoint(float id0[],float id1[],float id2[])
  {
    TransformVectorAtPoint_17(id0,id1,id2);
  }

  private native void TransformVectorAtPoint_18(double id0[],double id1[],double id2[]);
  public void TransformVectorAtPoint(double id0[],double id1[],double id2[])
  {
    TransformVectorAtPoint_18(id0,id1,id2);
  }

  private native double[] TransformVectorAtPoint_19(double id0[],double id1[]);
  public double[] TransformVectorAtPoint(double id0[],double id1[])
  {
    return TransformVectorAtPoint_19(id0,id1);
  }

  private native double[] TransformDoubleVectorAtPoint_20(double id0[],double id1[]);
  public double[] TransformDoubleVectorAtPoint(double id0[],double id1[])
  {
    return TransformDoubleVectorAtPoint_20(id0,id1);
  }

  private native float[] TransformFloatVectorAtPoint_21(float id0[],float id1[]);
  public float[] TransformFloatVectorAtPoint(float id0[],float id1[])
  {
    return TransformFloatVectorAtPoint_21(id0,id1);
  }

  private native void TransformPoints_22(vtkPoints id0,vtkPoints id1);
  public void TransformPoints(vtkPoints id0,vtkPoints id1)
  {
    TransformPoints_22(id0,id1);
  }

  private native long GetInverse_23();
  public vtkAbstractTransform GetInverse()
  {
    long temp = GetInverse_23();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInverse_24(vtkAbstractTransform id0);
  public void SetInverse(vtkAbstractTransform id0)
  {
    SetInverse_24(id0);
  }

  private native void Inverse_25();
  public void Inverse()
  {
    Inverse_25();
  }

  private native void DeepCopy_26(vtkAbstractTransform id0);
  public void DeepCopy(vtkAbstractTransform id0)
  {
    DeepCopy_26(id0);
  }

  private native void Update_27();
  public void Update()
  {
    Update_27();
  }

  private native void InternalTransformPoint_28(float id0[],float id1[]);
  public void InternalTransformPoint(float id0[],float id1[])
  {
    InternalTransformPoint_28(id0,id1);
  }

  private native void InternalTransformPoint_29(double id0[],double id1[]);
  public void InternalTransformPoint(double id0[],double id1[])
  {
    InternalTransformPoint_29(id0,id1);
  }

  private native long MakeTransform_30();
  public vtkAbstractTransform MakeTransform()
  {
    long temp = MakeTransform_30();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int CircuitCheck_31(vtkAbstractTransform id0);
  public int CircuitCheck(vtkAbstractTransform id0)
  {
    return CircuitCheck_31(id0);
  }

  private native long GetMTime_32();
  public long GetMTime()
  {
    return GetMTime_32();
  }

  private native void Modified_33();
  public void Modified()
  {
    Modified_33();
  }

  private native void UnRegister_34(vtkObjectBase id0);
  public void UnRegister(vtkObjectBase id0)
  {
    UnRegister_34(id0);
  }

  public vtkAbstractTransform() { super(); }

  public vtkAbstractTransform(long id) { super(id); }

}
