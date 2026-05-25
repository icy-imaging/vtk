// java wrapper for vtkCollisionDetectionFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCollisionDetectionFilter extends vtkPolyDataAlgorithm
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

  private native void SetCollisionMode_4(int id0);
  public void SetCollisionMode(int id0)
  {
    SetCollisionMode_4(id0);
  }

  private native int GetCollisionModeMinValue_5();
  public int GetCollisionModeMinValue()
  {
    return GetCollisionModeMinValue_5();
  }

  private native int GetCollisionModeMaxValue_6();
  public int GetCollisionModeMaxValue()
  {
    return GetCollisionModeMaxValue_6();
  }

  private native int GetCollisionMode_7();
  public int GetCollisionMode()
  {
    return GetCollisionMode_7();
  }

  private native void SetCollisionModeToAllContacts_8();
  public void SetCollisionModeToAllContacts()
  {
    SetCollisionModeToAllContacts_8();
  }

  private native void SetCollisionModeToFirstContact_9();
  public void SetCollisionModeToFirstContact()
  {
    SetCollisionModeToFirstContact_9();
  }

  private native void SetCollisionModeToHalfContacts_10();
  public void SetCollisionModeToHalfContacts()
  {
    SetCollisionModeToHalfContacts_10();
  }

  private native byte[] GetCollisionModeAsString_11();
  public String GetCollisionModeAsString()
  {
    return new String(GetCollisionModeAsString_11(), StandardCharsets.UTF_8);
  }

  private native void SetInputData_12(int id0,vtkPolyData id1);
  public void SetInputData(int id0,vtkPolyData id1)
  {
    SetInputData_12(id0,id1);
  }

  private native long GetInputData_13(int id0);
  public vtkPolyData GetInputData(int id0)
  {
    long temp = GetInputData_13(id0);

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetContactCells_14(int id0);
  public vtkIdTypeArray GetContactCells(int id0)
  {
    long temp = GetContactCells_14(id0);

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetContactsOutputPort_15();
  public vtkAlgorithmOutput GetContactsOutputPort()
  {
    long temp = GetContactsOutputPort_15();

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetContactsOutput_16();
  public vtkPolyData GetContactsOutput()
  {
    long temp = GetContactsOutput_16();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTransform_17(int id0,vtkLinearTransform id1);
  public void SetTransform(int id0,vtkLinearTransform id1)
  {
    SetTransform_17(id0,id1);
  }

  private native long GetTransform_18(int id0);
  public vtkLinearTransform GetTransform(int id0)
  {
    long temp = GetTransform_18(id0);

    if (temp == 0) return null;
    return (vtkLinearTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetMatrix_19(int id0,vtkMatrix4x4 id1);
  public void SetMatrix(int id0,vtkMatrix4x4 id1)
  {
    SetMatrix_19(id0,id1);
  }

  private native long GetMatrix_20(int id0);
  public vtkMatrix4x4 GetMatrix(int id0)
  {
    long temp = GetMatrix_20(id0);

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBoxTolerance_21(float id0);
  public void SetBoxTolerance(float id0)
  {
    SetBoxTolerance_21(id0);
  }

  private native float GetBoxTolerance_22();
  public float GetBoxTolerance()
  {
    return GetBoxTolerance_22();
  }

  private native void SetCellTolerance_23(double id0);
  public void SetCellTolerance(double id0)
  {
    SetCellTolerance_23(id0);
  }

  private native double GetCellTolerance_24();
  public double GetCellTolerance()
  {
    return GetCellTolerance_24();
  }

  private native void SetGenerateScalars_25(int id0);
  public void SetGenerateScalars(int id0)
  {
    SetGenerateScalars_25(id0);
  }

  private native int GetGenerateScalars_26();
  public int GetGenerateScalars()
  {
    return GetGenerateScalars_26();
  }

  private native void GenerateScalarsOn_27();
  public void GenerateScalarsOn()
  {
    GenerateScalarsOn_27();
  }

  private native void GenerateScalarsOff_28();
  public void GenerateScalarsOff()
  {
    GenerateScalarsOff_28();
  }

  private native int GetNumberOfContacts_29();
  public int GetNumberOfContacts()
  {
    return GetNumberOfContacts_29();
  }

  private native int GetNumberOfBoxTests_30();
  public int GetNumberOfBoxTests()
  {
    return GetNumberOfBoxTests_30();
  }

  private native void SetNumberOfCellsPerNode_31(int id0);
  public void SetNumberOfCellsPerNode(int id0)
  {
    SetNumberOfCellsPerNode_31(id0);
  }

  private native int GetNumberOfCellsPerNode_32();
  public int GetNumberOfCellsPerNode()
  {
    return GetNumberOfCellsPerNode_32();
  }

  private native void SetOpacity_33(float id0);
  public void SetOpacity(float id0)
  {
    SetOpacity_33(id0);
  }

  private native float GetOpacityMinValue_34();
  public float GetOpacityMinValue()
  {
    return GetOpacityMinValue_34();
  }

  private native float GetOpacityMaxValue_35();
  public float GetOpacityMaxValue()
  {
    return GetOpacityMaxValue_35();
  }

  private native float GetOpacity_36();
  public float GetOpacity()
  {
    return GetOpacity_36();
  }

  private native long GetMTime_37();
  public long GetMTime()
  {
    return GetMTime_37();
  }

  public vtkCollisionDetectionFilter() { super(); }

  public vtkCollisionDetectionFilter(long id) { super(id); }
  public native long   VTKInit();

}
