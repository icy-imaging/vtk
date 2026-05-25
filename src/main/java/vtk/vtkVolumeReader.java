// java wrapper for vtkVolumeReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVolumeReader extends vtkImageAlgorithm
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

  private native void SetFilePrefix_4(byte[] id0, int len0);
  public void SetFilePrefix(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFilePrefix_4(bytes0, bytes0.length);
  }

  private native byte[] GetFilePrefix_5();
  public String GetFilePrefix()
  {
    return new String(GetFilePrefix_5(), StandardCharsets.UTF_8);
  }

  private native void SetFilePattern_6(byte[] id0, int len0);
  public void SetFilePattern(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFilePattern_6(bytes0, bytes0.length);
  }

  private native byte[] GetFilePattern_7();
  public String GetFilePattern()
  {
    return new String(GetFilePattern_7(), StandardCharsets.UTF_8);
  }

  private native void SetImageRange_8(int id0,int id1);
  public void SetImageRange(int id0,int id1)
  {
    SetImageRange_8(id0,id1);
  }

  private native void SetImageRange_9(int id0[]);
  public void SetImageRange(int id0[])
  {
    SetImageRange_9(id0);
  }

  private native int[] GetImageRange_10();
  public int[] GetImageRange()
  {
    return GetImageRange_10();
  }

  private native void SetDataSpacing_11(double id0,double id1,double id2);
  public void SetDataSpacing(double id0,double id1,double id2)
  {
    SetDataSpacing_11(id0,id1,id2);
  }

  private native void SetDataSpacing_12(double id0[]);
  public void SetDataSpacing(double id0[])
  {
    SetDataSpacing_12(id0);
  }

  private native double[] GetDataSpacing_13();
  public double[] GetDataSpacing()
  {
    return GetDataSpacing_13();
  }

  private native void SetDataOrigin_14(double id0,double id1,double id2);
  public void SetDataOrigin(double id0,double id1,double id2)
  {
    SetDataOrigin_14(id0,id1,id2);
  }

  private native void SetDataOrigin_15(double id0[]);
  public void SetDataOrigin(double id0[])
  {
    SetDataOrigin_15(id0);
  }

  private native double[] GetDataOrigin_16();
  public double[] GetDataOrigin()
  {
    return GetDataOrigin_16();
  }

  private native long GetImage_17(int id0);
  public vtkImageData GetImage(int id0)
  {
    long temp = GetImage_17(id0);

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkVolumeReader() { super(); }

  public vtkVolumeReader(long id) { super(id); }

}
