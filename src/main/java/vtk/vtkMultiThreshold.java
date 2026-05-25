// java wrapper for vtkMultiThreshold object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMultiThreshold extends vtkMultiBlockDataSetAlgorithm
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

  private native int AddIntervalSet_4(double id0,double id1,int id2,int id3,int id4,byte[] id5, int len5,int id6,int id7);
  public int AddIntervalSet(double id0,double id1,int id2,int id3,int id4,String id5,int id6,int id7)
  {
    byte[] bytes5 = id5.getBytes(StandardCharsets.UTF_8);
    return AddIntervalSet_4(id0,id1,id2,id3,id4,bytes5, bytes5.length,id6,id7);
  }

  private native int AddIntervalSet_5(double id0,double id1,int id2,int id3,int id4,int id5,int id6,int id7);
  public int AddIntervalSet(double id0,double id1,int id2,int id3,int id4,int id5,int id6,int id7)
  {
    return AddIntervalSet_5(id0,id1,id2,id3,id4,id5,id6,id7);
  }

  private native int AddLowpassIntervalSet_6(double id0,int id1,byte[] id2, int len2,int id3,int id4);
  public int AddLowpassIntervalSet(double id0,int id1,String id2,int id3,int id4)
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return AddLowpassIntervalSet_6(id0,id1,bytes2, bytes2.length,id3,id4);
  }

  private native int AddHighpassIntervalSet_7(double id0,int id1,byte[] id2, int len2,int id3,int id4);
  public int AddHighpassIntervalSet(double id0,int id1,String id2,int id3,int id4)
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    return AddHighpassIntervalSet_7(id0,id1,bytes2, bytes2.length,id3,id4);
  }

  private native int AddBandpassIntervalSet_8(double id0,double id1,int id2,byte[] id3, int len3,int id4,int id5);
  public int AddBandpassIntervalSet(double id0,double id1,int id2,String id3,int id4,int id5)
  {
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    return AddBandpassIntervalSet_8(id0,id1,id2,bytes3, bytes3.length,id4,id5);
  }

  private native int AddNotchIntervalSet_9(double id0,double id1,int id2,byte[] id3, int len3,int id4,int id5);
  public int AddNotchIntervalSet(double id0,double id1,int id2,String id3,int id4,int id5)
  {
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    return AddNotchIntervalSet_9(id0,id1,id2,bytes3, bytes3.length,id4,id5);
  }

  private native int OutputSet_10(int id0);
  public int OutputSet(int id0)
  {
    return OutputSet_10(id0);
  }

  private native void Reset_11();
  public void Reset()
  {
    Reset_11();
  }

  public vtkMultiThreshold() { super(); }

  public vtkMultiThreshold(long id) { super(id); }
  public native long   VTKInit();

}
