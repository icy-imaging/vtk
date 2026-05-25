// java wrapper for vtkEnsembleSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkEnsembleSource extends vtkAlgorithm
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

  private native void AddMember_4(vtkAlgorithm id0);
  public void AddMember(vtkAlgorithm id0)
  {
    AddMember_4(id0);
  }

  private native void RemoveAllMembers_5();
  public void RemoveAllMembers()
  {
    RemoveAllMembers_5();
  }

  private native int GetNumberOfMembers_6();
  public int GetNumberOfMembers()
  {
    return GetNumberOfMembers_6();
  }

  private native void SetCurrentMember_7(int id0);
  public void SetCurrentMember(int id0)
  {
    SetCurrentMember_7(id0);
  }

  private native int GetCurrentMember_8();
  public int GetCurrentMember()
  {
    return GetCurrentMember_8();
  }

  private native void SetMetaData_9(vtkTable id0);
  public void SetMetaData(vtkTable id0)
  {
    SetMetaData_9(id0);
  }

  private native long META_DATA_10();
  public vtkInformationDataObjectMetaDataKey META_DATA()
  {
    long temp = META_DATA_10();

    if (temp == 0) return null;
    return (vtkInformationDataObjectMetaDataKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long UPDATE_MEMBER_11();
  public vtkInformationIntegerRequestKey UPDATE_MEMBER()
  {
    long temp = UPDATE_MEMBER_11();

    if (temp == 0) return null;
    return (vtkInformationIntegerRequestKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkEnsembleSource() { super(); }

  public vtkEnsembleSource(long id) { super(id); }
  public native long   VTKInit();

}
