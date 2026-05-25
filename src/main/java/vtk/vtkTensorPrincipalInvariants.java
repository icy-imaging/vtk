// java wrapper for vtkTensorPrincipalInvariants object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTensorPrincipalInvariants extends vtkDataSetAlgorithm
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

  private native boolean GetScaleVectors_4();
  public boolean GetScaleVectors()
  {
    return GetScaleVectors_4();
  }

  private native void SetScaleVectors_5(boolean id0);
  public void SetScaleVectors(boolean id0)
  {
    SetScaleVectors_5(id0);
  }

  private native long GetPointDataArraySelection_6();
  public vtkDataArraySelection GetPointDataArraySelection()
  {
    long temp = GetPointDataArraySelection_6();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCellDataArraySelection_7();
  public vtkDataArraySelection GetCellDataArraySelection()
  {
    long temp = GetCellDataArraySelection_7();

    if (temp == 0) return null;
    return (vtkDataArraySelection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native byte[] GetSigmaValueArrayName_8(byte[] id0, int len0,int id1);
  public String GetSigmaValueArrayName(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return new String(GetSigmaValueArrayName_8(bytes0, bytes0.length,id1), StandardCharsets.UTF_8);
  }

  private native byte[] GetSigmaVectorArrayName_9(byte[] id0, int len0,int id1);
  public String GetSigmaVectorArrayName(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return new String(GetSigmaVectorArrayName_9(bytes0, bytes0.length,id1), StandardCharsets.UTF_8);
  }

  public vtkTensorPrincipalInvariants() { super(); }

  public vtkTensorPrincipalInvariants(long id) { super(id); }
  public native long   VTKInit();

}
