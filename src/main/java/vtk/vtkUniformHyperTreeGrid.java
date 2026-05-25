// java wrapper for vtkUniformHyperTreeGrid object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkUniformHyperTreeGrid extends vtkHyperTreeGrid
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

  private native int GetDataObjectType_4();
  public int GetDataObjectType()
  {
    return GetDataObjectType_4();
  }

  private native void CopyStructure_5(vtkDataObject id0);
  public void CopyStructure(vtkDataObject id0)
  {
    CopyStructure_5(id0);
  }

  private native void Initialize_6();
  public void Initialize()
  {
    Initialize_6();
  }

  private native void SetOrigin_7(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_7(id0,id1,id2);
  }

  private native void SetOrigin_8(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_8(id0);
  }

  private native double[] GetOrigin_9();
  public double[] GetOrigin()
  {
    return GetOrigin_9();
  }

  private native void SetGridScale_10(double id0,double id1,double id2);
  public void SetGridScale(double id0,double id1,double id2)
  {
    SetGridScale_10(id0,id1,id2);
  }

  private native double[] GetGridScale_11();
  public double[] GetGridScale()
  {
    return GetGridScale_11();
  }

  private native void SetGridScale_12(double id0);
  public void SetGridScale(double id0)
  {
    SetGridScale_12(id0);
  }

  private native void GetGridBounds_13(double id0[]);
  public void GetGridBounds(double id0[])
  {
    GetGridBounds_13(id0);
  }

  private native void SetXCoordinates_14(vtkDataArray id0);
  public void SetXCoordinates(vtkDataArray id0)
  {
    SetXCoordinates_14(id0);
  }

  private native long GetXCoordinates_15();
  public vtkDataArray GetXCoordinates()
  {
    long temp = GetXCoordinates_15();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetYCoordinates_16(vtkDataArray id0);
  public void SetYCoordinates(vtkDataArray id0)
  {
    SetYCoordinates_16(id0);
  }

  private native long GetYCoordinates_17();
  public vtkDataArray GetYCoordinates()
  {
    long temp = GetYCoordinates_17();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetZCoordinates_18(vtkDataArray id0);
  public void SetZCoordinates(vtkDataArray id0)
  {
    SetZCoordinates_18(id0);
  }

  private native long GetZCoordinates_19();
  public vtkDataArray GetZCoordinates()
  {
    long temp = GetZCoordinates_19();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CopyCoordinates_20(vtkHyperTreeGrid id0);
  public void CopyCoordinates(vtkHyperTreeGrid id0)
  {
    CopyCoordinates_20(id0);
  }

  private native void SetFixedCoordinates_21(int id0,double id1);
  public void SetFixedCoordinates(int id0,double id1)
  {
    SetFixedCoordinates_21(id0,id1);
  }

  private native void ShallowCopy_22(vtkDataObject id0);
  public void ShallowCopy(vtkDataObject id0)
  {
    ShallowCopy_22(id0);
  }

  private native void DeepCopy_23(vtkDataObject id0);
  public void DeepCopy(vtkDataObject id0)
  {
    DeepCopy_23(id0);
  }

  private native long GetActualMemorySizeBytes_24();
  public long GetActualMemorySizeBytes()
  {
    return GetActualMemorySizeBytes_24();
  }

  private native long GetTree_25(long id0,boolean id1);
  public vtkHyperTree GetTree(long id0,boolean id1)
  {
    long temp = GetTree_25(id0,id1);

    if (temp == 0) return null;
    return (vtkHyperTree)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkUniformHyperTreeGrid() { super(); }

  public vtkUniformHyperTreeGrid(long id) { super(id); }
  public native long   VTKInit();

}
