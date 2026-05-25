// java wrapper for vtkInformationVariantVectorKey object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInformationVariantVectorKey extends vtkInformationKey
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

  private native long MakeKey_4(byte[] id0, int len0,byte[] id1, int len1,int id2);
  public vtkInformationVariantVectorKey MakeKey(String id0,String id1,int id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    long temp = MakeKey_4(bytes0, bytes0.length,bytes1, bytes1.length,id2);

    if (temp == 0) return null;
    return (vtkInformationVariantVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int Length_5(vtkInformation id0);
  public int Length(vtkInformation id0)
  {
    return Length_5(id0);
  }

  private native void ShallowCopy_6(vtkInformation id0,vtkInformation id1);
  public void ShallowCopy(vtkInformation id0,vtkInformation id1)
  {
    ShallowCopy_6(id0,id1);
  }

  public vtkInformationVariantVectorKey() { super(); }

  public vtkInformationVariantVectorKey(long id) { super(id); }

}
