// java wrapper for vtkImageReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageReader extends vtkImageReader2
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

  private native void SetDataVOI_4(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetDataVOI(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetDataVOI_4(id0,id1,id2,id3,id4,id5);
  }

  private native void SetDataVOI_5(int id0[]);
  public void SetDataVOI(int id0[])
  {
    SetDataVOI_5(id0);
  }

  private native int[] GetDataVOI_6();
  public int[] GetDataVOI()
  {
    return GetDataVOI_6();
  }

  private native long GetDataMask_7();
  public long GetDataMask()
  {
    return GetDataMask_7();
  }

  private native void SetDataMask_8(long id0);
  public void SetDataMask(long id0)
  {
    SetDataMask_8(id0);
  }

  private native void SetTransform_9(vtkTransform id0);
  public void SetTransform(vtkTransform id0)
  {
    SetTransform_9(id0);
  }

  private native long GetTransform_10();
  public vtkTransform GetTransform()
  {
    long temp = GetTransform_10();

    if (temp == 0) return null;
    return (vtkTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ComputeInverseTransformedExtent_11(int id0[],int id1[]);
  public void ComputeInverseTransformedExtent(int id0[],int id1[])
  {
    ComputeInverseTransformedExtent_11(id0,id1);
  }

  private native void ComputeInverseTransformedIncrements_12(long id0[],long id1[]);
  public void ComputeInverseTransformedIncrements(long id0[],long id1[])
  {
    ComputeInverseTransformedIncrements_12(id0,id1);
  }

  private native int OpenAndSeekFile_13(int id0[],int id1);
  public int OpenAndSeekFile(int id0[],int id1)
  {
    return OpenAndSeekFile_13(id0,id1);
  }

  private native void SetScalarArrayName_14(byte[] id0, int len0);
  public void SetScalarArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetScalarArrayName_14(bytes0, bytes0.length);
  }

  private native byte[] GetScalarArrayName_15();
  public String GetScalarArrayName()
  {
    return new String(GetScalarArrayName_15(), StandardCharsets.UTF_8);
  }

  private native int CanReadFile_16(byte[] id0, int len0);
  public int CanReadFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return CanReadFile_16(bytes0, bytes0.length);
  }

  public vtkImageReader() { super(); }

  public vtkImageReader(long id) { super(id); }
  public native long   VTKInit();

}
