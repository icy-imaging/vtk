// java wrapper for vtkInformationIntegerRequestKey object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInformationIntegerRequestKey extends vtkInformationIntegerKey
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

  private native long MakeKey_4(byte[] id0, int len0,byte[] id1, int len1);
  public vtkInformationIntegerRequestKey MakeKey(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    long temp = MakeKey_4(bytes0, bytes0.length,bytes1, bytes1.length);

    if (temp == 0) return null;
    return (vtkInformationIntegerRequestKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean NeedToExecute_5(vtkInformation id0,vtkInformation id1);
  public boolean NeedToExecute(vtkInformation id0,vtkInformation id1)
  {
    return NeedToExecute_5(id0,id1);
  }

  private native void StoreMetaData_6(vtkInformation id0,vtkInformation id1,vtkInformation id2);
  public void StoreMetaData(vtkInformation id0,vtkInformation id1,vtkInformation id2)
  {
    StoreMetaData_6(id0,id1,id2);
  }

  private native void CopyDefaultInformation_7(vtkInformation id0,vtkInformation id1,vtkInformation id2);
  public void CopyDefaultInformation(vtkInformation id0,vtkInformation id1,vtkInformation id2)
  {
    CopyDefaultInformation_7(id0,id1,id2);
  }

  public vtkInformationIntegerRequestKey() { super(); }

  public vtkInformationIntegerRequestKey(long id) { super(id); }

}
