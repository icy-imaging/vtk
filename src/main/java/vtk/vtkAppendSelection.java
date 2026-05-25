// java wrapper for vtkAppendSelection object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAppendSelection extends vtkSelectionAlgorithm
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

  private native void SetExpression_4(byte[] id0, int len0);
  public void SetExpression(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetExpression_4(bytes0, bytes0.length);
  }

  private native byte[] GetExpression_5();
  public String GetExpression()
  {
    return new String(GetExpression_5(), StandardCharsets.UTF_8);
  }

  private native void SetInverse_6(boolean id0);
  public void SetInverse(boolean id0)
  {
    SetInverse_6(id0);
  }

  private native void InverseOn_7();
  public void InverseOn()
  {
    InverseOn_7();
  }

  private native void InverseOff_8();
  public void InverseOff()
  {
    InverseOff_8();
  }

  private native boolean GetInverse_9();
  public boolean GetInverse()
  {
    return GetInverse_9();
  }

  private native void SetInputName_10(int id0,byte[] id1, int len1);
  public void SetInputName(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetInputName_10(id0,bytes1, bytes1.length);
  }

  private native byte[] GetInputName_11(int id0);
  public String GetInputName(int id0)
  {
    return new String(GetInputName_11(id0), StandardCharsets.UTF_8);
  }

  private native void RemoveAllInputNames_12();
  public void RemoveAllInputNames()
  {
    RemoveAllInputNames_12();
  }

  private native void SetInputColor_13(int id0,double id1,double id2,double id3);
  public void SetInputColor(int id0,double id1,double id2,double id3)
  {
    SetInputColor_13(id0,id1,id2,id3);
  }

  private native void RemoveAllInputColors_14();
  public void RemoveAllInputColors()
  {
    RemoveAllInputColors_14();
  }

  private native void SetUserManagedInputs_15(int id0);
  public void SetUserManagedInputs(int id0)
  {
    SetUserManagedInputs_15(id0);
  }

  private native int GetUserManagedInputs_16();
  public int GetUserManagedInputs()
  {
    return GetUserManagedInputs_16();
  }

  private native void UserManagedInputsOn_17();
  public void UserManagedInputsOn()
  {
    UserManagedInputsOn_17();
  }

  private native void UserManagedInputsOff_18();
  public void UserManagedInputsOff()
  {
    UserManagedInputsOff_18();
  }

  private native void AddInputData_19(vtkSelection id0);
  public void AddInputData(vtkSelection id0)
  {
    AddInputData_19(id0);
  }

  private native void RemoveInputData_20(vtkSelection id0);
  public void RemoveInputData(vtkSelection id0)
  {
    RemoveInputData_20(id0);
  }

  private native long GetInput_21(int id0);
  public vtkSelection GetInput(int id0)
  {
    long temp = GetInput_21(id0);

    if (temp == 0) return null;
    return (vtkSelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInput_22();
  public vtkSelection GetInput()
  {
    long temp = GetInput_22();

    if (temp == 0) return null;
    return (vtkSelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetNumberOfInputs_23(int id0);
  public void SetNumberOfInputs(int id0)
  {
    SetNumberOfInputs_23(id0);
  }

  private native void SetInputConnectionByNumber_24(int id0,vtkAlgorithmOutput id1);
  public void SetInputConnectionByNumber(int id0,vtkAlgorithmOutput id1)
  {
    SetInputConnectionByNumber_24(id0,id1);
  }

  private native void SetAppendByUnion_25(int id0);
  public void SetAppendByUnion(int id0)
  {
    SetAppendByUnion_25(id0);
  }

  private native int GetAppendByUnion_26();
  public int GetAppendByUnion()
  {
    return GetAppendByUnion_26();
  }

  private native void AppendByUnionOn_27();
  public void AppendByUnionOn()
  {
    AppendByUnionOn_27();
  }

  private native void AppendByUnionOff_28();
  public void AppendByUnionOff()
  {
    AppendByUnionOff_28();
  }

  private native byte[] GetColorArrayName_29();
  public String GetColorArrayName()
  {
    return new String(GetColorArrayName_29(), StandardCharsets.UTF_8);
  }

  public vtkAppendSelection() { super(); }

  public vtkAppendSelection(long id) { super(id); }
  public native long   VTKInit();

}
