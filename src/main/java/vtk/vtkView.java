// java wrapper for vtkView object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkView extends vtkObject
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

  private native void AddRepresentation_4(vtkDataRepresentation id0);
  public void AddRepresentation(vtkDataRepresentation id0)
  {
    AddRepresentation_4(id0);
  }

  private native void SetRepresentation_5(vtkDataRepresentation id0);
  public void SetRepresentation(vtkDataRepresentation id0)
  {
    SetRepresentation_5(id0);
  }

  private native long AddRepresentationFromInputConnection_6(vtkAlgorithmOutput id0);
  public vtkDataRepresentation AddRepresentationFromInputConnection(vtkAlgorithmOutput id0)
  {
    long temp = AddRepresentationFromInputConnection_6(id0);

    if (temp == 0) return null;
    return (vtkDataRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long SetRepresentationFromInputConnection_7(vtkAlgorithmOutput id0);
  public vtkDataRepresentation SetRepresentationFromInputConnection(vtkAlgorithmOutput id0)
  {
    long temp = SetRepresentationFromInputConnection_7(id0);

    if (temp == 0) return null;
    return (vtkDataRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long AddRepresentationFromInput_8(vtkDataObject id0);
  public vtkDataRepresentation AddRepresentationFromInput(vtkDataObject id0)
  {
    long temp = AddRepresentationFromInput_8(id0);

    if (temp == 0) return null;
    return (vtkDataRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long SetRepresentationFromInput_9(vtkDataObject id0);
  public vtkDataRepresentation SetRepresentationFromInput(vtkDataObject id0)
  {
    long temp = SetRepresentationFromInput_9(id0);

    if (temp == 0) return null;
    return (vtkDataRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void RemoveRepresentation_10(vtkDataRepresentation id0);
  public void RemoveRepresentation(vtkDataRepresentation id0)
  {
    RemoveRepresentation_10(id0);
  }

  private native void RemoveRepresentation_11(vtkAlgorithmOutput id0);
  public void RemoveRepresentation(vtkAlgorithmOutput id0)
  {
    RemoveRepresentation_11(id0);
  }

  private native void RemoveAllRepresentations_12();
  public void RemoveAllRepresentations()
  {
    RemoveAllRepresentations_12();
  }

  private native int GetNumberOfRepresentations_13();
  public int GetNumberOfRepresentations()
  {
    return GetNumberOfRepresentations_13();
  }

  private native long GetRepresentation_14(int id0);
  public vtkDataRepresentation GetRepresentation(int id0)
  {
    long temp = GetRepresentation_14(id0);

    if (temp == 0) return null;
    return (vtkDataRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean IsRepresentationPresent_15(vtkDataRepresentation id0);
  public boolean IsRepresentationPresent(vtkDataRepresentation id0)
  {
    return IsRepresentationPresent_15(id0);
  }

  private native void Update_16();
  public void Update()
  {
    Update_16();
  }

  private native void ApplyViewTheme_17(vtkViewTheme id0);
  public void ApplyViewTheme(vtkViewTheme id0)
  {
    ApplyViewTheme_17(id0);
  }

  private native long GetObserver_18();
  public vtkCommand GetObserver()
  {
    long temp = GetObserver_18();

    if (temp == 0) return null;
    return (vtkCommand)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void RegisterProgress_19(vtkObject id0,byte[] id1, int len1);
  public void RegisterProgress(vtkObject id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    RegisterProgress_19(id0,bytes1, bytes1.length);
  }

  private native void UnRegisterProgress_20(vtkObject id0);
  public void UnRegisterProgress(vtkObject id0)
  {
    UnRegisterProgress_20(id0);
  }

  public vtkView() { super(); }

  public vtkView(long id) { super(id); }
  public native long   VTKInit();

}
