// java wrapper for vtkImplicitBoolean object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImplicitBoolean extends vtkImplicitFunction
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

  private native double EvaluateFunction_4(double id0[]);
  public double EvaluateFunction(double id0[])
  {
    return EvaluateFunction_4(id0);
  }

  private native void EvaluateGradient_5(double id0[],double id1[]);
  public void EvaluateGradient(double id0[],double id1[])
  {
    EvaluateGradient_5(id0,id1);
  }

  private native long GetMTime_6();
  public long GetMTime()
  {
    return GetMTime_6();
  }

  private native void AddFunction_7(vtkImplicitFunction id0);
  public void AddFunction(vtkImplicitFunction id0)
  {
    AddFunction_7(id0);
  }

  private native void RemoveFunction_8(vtkImplicitFunction id0);
  public void RemoveFunction(vtkImplicitFunction id0)
  {
    RemoveFunction_8(id0);
  }

  private native long GetFunction_9();
  public vtkImplicitFunctionCollection GetFunction()
  {
    long temp = GetFunction_9();

    if (temp == 0) return null;
    return (vtkImplicitFunctionCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOperationType_10(int id0);
  public void SetOperationType(int id0)
  {
    SetOperationType_10(id0);
  }

  private native int GetOperationTypeMinValue_11();
  public int GetOperationTypeMinValue()
  {
    return GetOperationTypeMinValue_11();
  }

  private native int GetOperationTypeMaxValue_12();
  public int GetOperationTypeMaxValue()
  {
    return GetOperationTypeMaxValue_12();
  }

  private native int GetOperationType_13();
  public int GetOperationType()
  {
    return GetOperationType_13();
  }

  private native void SetOperationTypeToUnion_14();
  public void SetOperationTypeToUnion()
  {
    SetOperationTypeToUnion_14();
  }

  private native void SetOperationTypeToIntersection_15();
  public void SetOperationTypeToIntersection()
  {
    SetOperationTypeToIntersection_15();
  }

  private native void SetOperationTypeToDifference_16();
  public void SetOperationTypeToDifference()
  {
    SetOperationTypeToDifference_16();
  }

  private native void SetOperationTypeToUnionOfMagnitudes_17();
  public void SetOperationTypeToUnionOfMagnitudes()
  {
    SetOperationTypeToUnionOfMagnitudes_17();
  }

  private native byte[] GetOperationTypeAsString_18();
  public String GetOperationTypeAsString()
  {
    return new String(GetOperationTypeAsString_18(), StandardCharsets.UTF_8);
  }

  private native void EvaluateFunction_19(vtkDataArray id0,vtkDataArray id1);
  public void EvaluateFunction(vtkDataArray id0,vtkDataArray id1)
  {
    EvaluateFunction_19(id0,id1);
  }

  private native double EvaluateFunction_20(double id0,double id1,double id2);
  public double EvaluateFunction(double id0,double id1,double id2)
  {
    return EvaluateFunction_20(id0,id1,id2);
  }

  public vtkImplicitBoolean() { super(); }

  public vtkImplicitBoolean(long id) { super(id); }
  public native long   VTKInit();

}
