// java wrapper for vtkSeedRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSeedRepresentation extends vtkWidgetRepresentation
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

  private native void GetSeedWorldPosition_4(int id0,double id1[]);
  public void GetSeedWorldPosition(int id0,double id1[])
  {
    GetSeedWorldPosition_4(id0,id1);
  }

  private native void SetSeedWorldPosition_5(int id0,double id1[]);
  public void SetSeedWorldPosition(int id0,double id1[])
  {
    SetSeedWorldPosition_5(id0,id1);
  }

  private native void SetSeedDisplayPosition_6(int id0,double id1[]);
  public void SetSeedDisplayPosition(int id0,double id1[])
  {
    SetSeedDisplayPosition_6(id0,id1);
  }

  private native void GetSeedDisplayPosition_7(int id0,double id1[]);
  public void GetSeedDisplayPosition(int id0,double id1[])
  {
    GetSeedDisplayPosition_7(id0,id1);
  }

  private native int GetNumberOfSeeds_8();
  public int GetNumberOfSeeds()
  {
    return GetNumberOfSeeds_8();
  }

  private native void SetHandleRepresentation_9(vtkHandleRepresentation id0);
  public void SetHandleRepresentation(vtkHandleRepresentation id0)
  {
    SetHandleRepresentation_9(id0);
  }

  private native long GetHandleRepresentation_10(int id0);
  public vtkHandleRepresentation GetHandleRepresentation(int id0)
  {
    long temp = GetHandleRepresentation_10(id0);

    if (temp == 0) return null;
    return (vtkHandleRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetHandleRepresentation_11();
  public vtkHandleRepresentation GetHandleRepresentation()
  {
    long temp = GetHandleRepresentation_11();

    if (temp == 0) return null;
    return (vtkHandleRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTolerance_12(int id0);
  public void SetTolerance(int id0)
  {
    SetTolerance_12(id0);
  }

  private native int GetToleranceMinValue_13();
  public int GetToleranceMinValue()
  {
    return GetToleranceMinValue_13();
  }

  private native int GetToleranceMaxValue_14();
  public int GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_14();
  }

  private native int GetTolerance_15();
  public int GetTolerance()
  {
    return GetTolerance_15();
  }

  private native int GetActiveHandle_16();
  public int GetActiveHandle()
  {
    return GetActiveHandle_16();
  }

  private native void SetActiveHandle_17(int id0);
  public void SetActiveHandle(int id0)
  {
    SetActiveHandle_17(id0);
  }

  private native int CreateHandle_18(double id0[]);
  public int CreateHandle(double id0[])
  {
    return CreateHandle_18(id0);
  }

  private native void RemoveLastHandle_19();
  public void RemoveLastHandle()
  {
    RemoveLastHandle_19();
  }

  private native void RemoveActiveHandle_20();
  public void RemoveActiveHandle()
  {
    RemoveActiveHandle_20();
  }

  private native void RemoveHandle_21(int id0);
  public void RemoveHandle(int id0)
  {
    RemoveHandle_21(id0);
  }

  private native void BuildRepresentation_22();
  public void BuildRepresentation()
  {
    BuildRepresentation_22();
  }

  private native int ComputeInteractionState_23(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_23(id0,id1,id2);
  }

  private native void GetActors_24(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_24(id0);
  }

  public vtkSeedRepresentation() { super(); }

  public vtkSeedRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
