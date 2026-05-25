// java wrapper for vtkDemandDrivenPipeline object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDemandDrivenPipeline extends vtkExecutive
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

  private native int Update_4();
  public int Update()
  {
    return Update_4();
  }

  private native int Update_5(int id0);
  public int Update(int id0)
  {
    return Update_5(id0);
  }

  private native long GetPipelineMTime_6();
  public long GetPipelineMTime()
  {
    return GetPipelineMTime_6();
  }

  private native int SetReleaseDataFlag_7(int id0,int id1);
  public int SetReleaseDataFlag(int id0,int id1)
  {
    return SetReleaseDataFlag_7(id0,id1);
  }

  private native int GetReleaseDataFlag_8(int id0);
  public int GetReleaseDataFlag(int id0)
  {
    return GetReleaseDataFlag_8(id0);
  }

  private native int UpdatePipelineMTime_9();
  public int UpdatePipelineMTime()
  {
    return UpdatePipelineMTime_9();
  }

  private native int UpdateDataObject_10();
  public int UpdateDataObject()
  {
    return UpdateDataObject_10();
  }

  private native int UpdateInformation_11();
  public int UpdateInformation()
  {
    return UpdateInformation_11();
  }

  private native int UpdateData_12(int id0);
  public int UpdateData(int id0)
  {
    return UpdateData_12(id0);
  }

  private native long REQUEST_DATA_OBJECT_13();
  public vtkInformationRequestKey REQUEST_DATA_OBJECT()
  {
    long temp = REQUEST_DATA_OBJECT_13();

    if (temp == 0) return null;
    return (vtkInformationRequestKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long REQUEST_INFORMATION_14();
  public vtkInformationRequestKey REQUEST_INFORMATION()
  {
    long temp = REQUEST_INFORMATION_14();

    if (temp == 0) return null;
    return (vtkInformationRequestKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long REQUEST_DATA_15();
  public vtkInformationRequestKey REQUEST_DATA()
  {
    long temp = REQUEST_DATA_15();

    if (temp == 0) return null;
    return (vtkInformationRequestKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long REQUEST_DATA_NOT_GENERATED_16();
  public vtkInformationRequestKey REQUEST_DATA_NOT_GENERATED()
  {
    long temp = REQUEST_DATA_NOT_GENERATED_16();

    if (temp == 0) return null;
    return (vtkInformationRequestKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long RELEASE_DATA_17();
  public vtkInformationIntegerKey RELEASE_DATA()
  {
    long temp = RELEASE_DATA_17();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long DATA_NOT_GENERATED_18();
  public vtkInformationIntegerKey DATA_NOT_GENERATED()
  {
    long temp = DATA_NOT_GENERATED_18();

    if (temp == 0) return null;
    return (vtkInformationIntegerKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long NewDataObject_19(byte[] id0, int len0);
  public vtkDataObject NewDataObject(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = NewDataObject_19(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkDemandDrivenPipeline() { super(); }

  public vtkDemandDrivenPipeline(long id) { super(id); }
  public native long   VTKInit();

}
